package Main;

import Utilidad.Lista.*;
import java.util.Random;
import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.EventosAleatorios.EATiempo.EATiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.AumentarFuerza.MagiaFuerza;
import Entidades.Objetos.Magias.Escudos.MagiaEscudo;
import Main.Estados.EstadoJuego;
import Main.Estados.Jugando;
import Main.Tienda.Tienda;

public class MapaLogico {
	
	// Para los niveles;
//	protected PositionList<Entidad> nivel;
//	protected int cantEnemigos = 2;
//	protected int nivelMaximo = 2;
//	protected int nivelActual = 1;
//	protected boolean quedanEnemigos;
//	protected CargadorNivel cargadorNivel;
	protected CargadorNivel cargadorNivel;
	protected int cantEnemigos;
	protected int CANT_NIVELES = 1;
	protected int nivelActual;
	protected GeneradorDeNiveles generadorN;
	
	
	//Atributos de instancia ndeahh re IPOO.
	protected PositionList<Entidad> entidades;
	protected PositionList<Position<Entidad>> aBorrar;
	protected PositionList<Entidad> aInsertar;
	
	protected boolean juegoTerminado;

	protected Tienda tienda;
	protected Jugador jugador;
	private EstadoJuego estadoJuego;
	private MapaGUI mapaGUI;
	protected Magia magiaAplicada;
	
	public MapaLogico() {
		this.jugador = new Jugador(240);
		this.tienda = new Tienda(this, jugador);
		this.mapaGUI = new MapaGUI(this, tienda, jugador);
		mapaGUI.setVisible(true);
		entidades = new DoubleLinkedList<Entidad>();
		aBorrar = new DoubleLinkedList<Position<Entidad>>();
		aInsertar = new DoubleLinkedList<Entidad>();
		estadoJuego = new Jugando(this);
		magiaAplicada = null;
		juegoTerminado = false;
		
		this.nivelActual = 0;
		this.generadorN = new GeneradorDeNiveles(this);
		
//		nivel = generarNivel();
//		cargadorNivel = new CargadorNivel(this,nivel);
//		cargadorNivel.start();
		
		
	}
	
	public void restarEnemigo() {
		this.cantEnemigos -= 1;
	}
	
	public void setEstado(EstadoJuego e) {
		this.estadoJuego = e;
	}
	
	public void accionar(int x, int y) {
		this.estadoJuego.actua(x, y); //Delego todo el quilombo al patron electoral.
	}
	
	public PositionList<Entidad> getListaEntidades(){
		return entidades;
	}
	
	public void insertar(Entidad e) {
		this.aInsertar.addLast(e);
	}
	
	public void eliminar(Position<Entidad> pos) {
		mapaGUI.remover(pos.element().getGrafica());
		this.aBorrar.addLast(pos);
	}
	
	public Magia getMagiaRandom() {
		Magia toReturn = null;
		Random rnd = new Random();
		
		switch(rnd.nextInt(2)) {
			
			case(0):{
				toReturn = new MagiaEscudo(this);
				break;
			}
			case(1):{
				toReturn = new MagiaFuerza(this);
				break;	
			}
		}
		return toReturn;
	}
	
 	public void actualizar() {
 		if (!this.juegoTerminado) {
 				
 			//Genera y carga el nivel
 			if(cantEnemigos == 0) {
	 			if(nivelActual == CANT_NIVELES) {
	 				ganarJuego();
	 			}
	 			else {
	 				++nivelActual;
	 				PositionList<Enemigo> nivel = generadorN.generarNivel();
	 				
	 				int cont = 0;
	 				for (Enemigo e : nivel) {
	 					if (e != null) {
	 						cont++;
	 					}
	 				}
	 				this.cantEnemigos = cont;
	 				
	 	 	 		cargadorNivel = new CargadorNivel(this, nivel);
	 	 	 		cargadorNivel.start();

	 			}
	 		}	
 			 			
	 		//Recorre toda la lista y llamo a los accionar de las clases.
	 		for(Entidad e : this.entidades) {
				e.accionar();
	 		}
	 		
	 		//Borra las entidades eliminadas.
	 		for(Position<Entidad> p : this.aBorrar) {
	 			try {
					this.entidades.remove(p);
				} catch (InvalidPositionException e1) {
					e1.printStackTrace();
				}
	 		}
	 		this.aBorrar = new DoubleLinkedList<Position<Entidad>>();
	 		
	 		//Inserta a la lista de entidades las nuevas entidades.
	 		for (Entidad e : this.aInsertar) {
	 			this.entidades.addLast(e);
	 			try {
	 				e.setPosEnLista(this.entidades.last());
	 			} catch (EmptyListException e1) {
	 				e1.printStackTrace();
	 			}
	 			mapaGUI.insertar(e.getGrafica());	 			
	 		}
	 		this.aInsertar = new DoubleLinkedList<Entidad>();
	 		
	 		
	 		
 			// Puede o no generar un evento;
 			generarEventoRandom();
 			
 	
	 		
	 		
	 		
	 		// PARA NIVELES !!!!!!!!! ARREGLAR EL InstansOf falso para detectar que no hay m�s enmigos;
	 		/*
	 		 * Si la lista esta vacia y no hay m�s enmigos en entidades, termino nivel; (Controlo con entero que no sea el ultimo nivel);
	 		 * sino carga el siguiente nivel; ++nivelActual;
	 		 */
	 		
//	 		Visitante v = new VisitanteEnemigo(this);
//	 		quedanEnemigos = false; // Asumis que no quedan ninguno;
//	 		// Si depsues de recorrer todo quedanEnemigos es verdadero, hay vivos;
//	 		
//	 		for(Entidad e : this.entidades) {
//	 			e.visitar(v);
//	 		}
//	 		
//	 		if(nivel.isEmpty() && !quedanEnemigos) {
//	 			if(nivelActual == nivelMaximo) {
//	 				ganarJuego();
//	 			}
//	 			else {
//	 				++nivelActual;
//	 	 	 		generarNivel();	
//	 	 	 		cargadorNivel = new CargadorNivel(this,nivel);
//	 	 	 		cargadorNivel.start();
//	 			}
//	 		}	
 		}
	}
 	
// 	public void hayEnemigos(boolean b) {
// 		quedanEnemigos = b; 		
// 	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
//	public void aplicarMagia(Campeon c, Magia m) {
//		c.agregarMagia(m);
//	}
	
	public PositionList<Entidad> colisione(int x, int y) {
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			if ((x >= e.getX() && x <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
	}
	
	//Detecta entidades entre x1 y x2 (x1 coordenada mas a la izquierda del mapaGUI, x2 coordenada mas a la derecha del mapaGUI).
	public PositionList<Entidad> colisioneRango(int x1, int x2, int y1, int y2) {
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			
			if (((e.getX() >= x1 && e.getX() <= x2) || (e.getX()+e.getAncho() >= x1 && e.getX()+e.getAncho() <= x2)) &&  ((e.getY() >= y1 && e.getY() <= y2) || (e.getY()+e.getAlto() >= y1 && e.getY()+e.getAlto() <= y2))) {
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
	public Jugador getJugador() {
		return this.jugador;
	}
	
	public MapaGUI getMapaGUI() {
		return this.mapaGUI;
	}
	
	public Magia getMagia(){
		return this.magiaAplicada;
	}
	
	public void setMagia(Magia m) {
		this.magiaAplicada = m;
	}
	
	
	public void generarEventoRandom() {
		// 233 + 320 --> 233 por margen, y 320 por 4 casillas; x > 553;
		// Meno a 233 + 841; x < 1074
		
		// y > 42;  y < 42 + 487 == 529;
				
		
		Random rand = new Random();
		
		if(rand.nextInt(1000) == 0) {
			
			int i = 0;
			int y = 0;
			int x = 0;
			boolean encontreLugar = false;
			PositionList<Entidad> listaColisionado;
			
			
			while(i < 5 && !encontreLugar) {				
				x = ((((rand.nextInt(5) + 4) * 841) / 10 ) + 233);
				y = (((rand.nextInt(6) * 487) / 6) + 42);
				
				encontreLugar = true;
				
				listaColisionado = colisioneRango(x, x+80, y, y+80);
				
				if(!listaColisionado.isEmpty()) {
					encontreLugar = false;
					++i;
				}
			}
			
			if(encontreLugar) {			
				if(rand.nextInt(2) == 0) { // EA Tiempo;
					EATiempo evento = new EATiempo(this);
					this.insertar(evento);
					evento.setX(x);
					evento.setY(y);
				}
				else { // EA Vida;
					EAVida evento = new EAVida(this);
					this.insertar(evento);
					evento.setX(x);
					evento.setY(y);
				}
			}
		}
		
	}
	
	

//	public PositionList<Enemigo> generarNivel() {
//		// Consite en generar 3 oleadas, con +2 enemigos en cada una;
//		
//		nivel = new DoubleLinkedList<Enemigo>(); // Limpio lista por las dudas;
//		
//		for(int i = 0; i < 3; i++) {
//			generarOleada();
//			nivel.addLast(null); // Esta la bandera
//			cantEnemigos = cantEnemigos + 2;
//		}
//		
//		return nivel;
//			
//	}
//	
//	private void generarOleada() {
//		int numEnemigo = 0;
//		Enemigo enemigo = null; // Enemigo a meter a la lista;
//		
//		Random r = new Random();	
//			
//			
//		for(int i = 0; i < cantEnemigos; i++) {
//		
//			numEnemigo = r.nextInt(5); // Que enemigo va a meter;
//			
//				
//			switch(numEnemigo) {
//				case(0):{
//					enemigo = new Casper(this);
//					break;
//				}
//				case(1):{
//					enemigo = new Cerebro(this);
//					break;
//				}
//				case(2):{
//					enemigo = new Colmena(this);
//					break;
//				}
//				case(3):{
//					enemigo = new IsaacCerebro(this);
//					break;
//				}
//				case(4):{
//					enemigo = new CerebroDemonio(this);
//					break;
//				}
//			}
//					
//			nivel.addLast(enemigo);
//		}	
//	}
	
	@SuppressWarnings("deprecation")
	public void ganarJuego() {
		for (Entidad e : this.entidades) {
			e.eliminar();
		}
		this.aInsertar = new DoubleLinkedList<Entidad>();
		this.juegoTerminado = true;
		if (cargadorNivel.isAlive()) {
			this.cargadorNivel.stop();
		}
		this.mapaGUI.ganarJuego();
	}
	
	@SuppressWarnings("deprecation")
	public void perderJuego() {
		for (Entidad e : this.entidades) {
			e.eliminar();
		}
		this.aInsertar = new DoubleLinkedList<Entidad>();
		this.juegoTerminado = true;
		if (cargadorNivel.isAlive()) {
			this.cargadorNivel.stop();			
		}
		this.mapaGUI.perderJuego();
	}
	
}
