package Main;

import Utilidad.Lista.*;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Enemigos.Casper.Casper;
import Entidades.Campeones.Enemigos.Cerebro.Cerebro;
import Entidades.Campeones.Enemigos.Cerebro_Demonio.CerebroDemonio;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Entidades.Campeones.Enemigos.Isaac_Cerebro.IsaacCerebro;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.AumentarFuerza.MagiaFuerza;
import Entidades.Objetos.Magias.Escudos.MagiaEscudo;
import Main.Estados.EstadoJuego;
import Main.Estados.Jugando;
import Main.Tienda.Tienda;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteEnemigo;

public class MapaLogico {
	
	// Para los niveles;
	protected PositionList<Entidad> nivel;
	protected int cantEnemigos = 2;
	protected int nivelMaximo = 2;
	protected int nivelActual = 1;
	protected boolean quedanEnemigos;
	protected CargadorNivel cargadorNivel;
	
	
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
		this.jugador = new Jugador(100);
		this.tienda = new Tienda(this, jugador);
		this.mapaGUI = new MapaGUI(this, tienda, jugador);
		mapaGUI.setVisible(true);
		entidades = new DoubleLinkedList<Entidad>();
		aBorrar = new DoubleLinkedList<Position<Entidad>>();
		aInsertar = new DoubleLinkedList<Entidad>();
		estadoJuego = new Jugando(this);
		magiaAplicada = null;
		juegoTerminado = false;
		
		
		PositionList<Entidad> nivel = generarNivel();
		cargadorNivel = new CargadorNivel(this,nivel);
		cargadorNivel.start();
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
		pos.element().setVivo(false);
		mapaGUI.remover(pos.element().getGrafica());
		this.aBorrar.addLast(pos);
	}
	
 	public void actualizar() {
 		if (!this.juegoTerminado) {
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
	 		
	 		// PARA NIVELES !!!!!!!!! ARREGLAR EL InstansOf falso para detectar que no hay m�s enmigos;
	 		/*
	 		 * Si la lista esta vacia y no hay m�s enmigos en entidades, termino nivel; (Controlo con entero que no sea el ultimo nivel);
	 		 * sino carga el siguiente nivel; ++nivelActual;
	 		 */
	 		
	 		Visitante v = new VisitanteEnemigo(this);
	 		quedanEnemigos = false; // Asumis que no quedan ninguno;
	 		// Si depsues de recorrer todo quedanEnemigos es verdadero, hay vivos;
	 		
	 		for(Entidad e : this.entidades) {
	 			e.visitar(v);
	 		}
	 		
	 		if(nivel.isEmpty() && !quedanEnemigos) {
	 			if(nivelActual == nivelMaximo) {
	 				ganarJuego();
	 			}
	 			else {
	 				++nivelActual;
	 	 	 		generarNivel();	
	 	 	 		cargadorNivel = new CargadorNivel(this,nivel);
	 	 	 		cargadorNivel.start();
	 			}
	 		}	
 		}
	}
 	
 	public void hayEnemigos(boolean b) {
 		quedanEnemigos = b; 		
 	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.agregarMagia(m);
	}
	
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
	public PositionList<Entidad> colisioneRango(int x1, int x2, int y) {
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			
			if (((e.getX() >= x1 && e.getX() <= x2) || (e.getX()+e.getAncho() >= x1 && e.getX()+e.getAncho() <= x2)) &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
	public MapaGUI getMapaGUI() {
		return mapaGUI;
	}
	
	public Magia getMagia(){
		return this.magiaAplicada;
	}
	
	public void setMagia(Magia m) {
		this.magiaAplicada = m;
	}

	public PositionList<Entidad> generarNivel() {
		// Consite en generar 3 oleadas, con +2 enemigos en cada una;
		
		nivel = new DoubleLinkedList<Entidad>(); // Limpio lista por las dudas;
		
		for(int i = 0; i < 3; i++) {
			generarOleada();
			nivel.addLast(null); // Esta la bandera
			cantEnemigos = cantEnemigos + 2;
		}
		
		return nivel;
			
	}
	
	private void generarOleada() {
		int numEnemigo = 0;
		int tieneMagia = 0;
		int queMagia  = 0;
		Entidad enemigo = null; // Enemigo a meter a la lista;
		Magia magia = null;
		
		Random r = new Random();	
			
			
		for(int i = 0; i < cantEnemigos; i++) {
		
			magia = null;
			numEnemigo = r.nextInt(5); // Que enemigo va a meter;
			tieneMagia = r.nextInt(1); // Si tiene magia o no (Es para prueba); 
			
			if(tieneMagia == 0) { // Si tiene magia;
				queMagia = r.nextInt(2); // Que tipo de magia va a tener (Es para prueba);
				
				switch(queMagia) {
					case(0):{
						magia = new MagiaEscudo(9, 9, this);
						break;
					}
					case(1):{
						magia = new MagiaFuerza(9, 9, this);
						break;	
					}
				}
			}
				
			switch(numEnemigo) {
				case(0):{
					enemigo = new Casper(this, magia);
					break;
				}
				case(1):{
					enemigo = new Cerebro(this, magia);
					break;
				}
				case(2):{
					enemigo = new Colmena(this, magia);
					break;
				}
				case(3):{
					enemigo = new IsaacCerebro(this, magia);
					break;
				}
				case(4):{
					enemigo = new CerebroDemonio(this, magia);
					break;
				}
			}
					
			nivel.addLast(enemigo);
		}	
	}
	
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
