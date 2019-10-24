package Main;

import Utilidad.Lista.*;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Entidades.Objetos.Magias.Magia;
import Main.Estados.EstadoJuego;
import Main.Estados.Jugando;
import Main.Tienda.Tienda;

public class MapaLogico {
	
	// Para los niveles;
	protected PositionList<Entidad> nivel;
	protected int cantEnemigos = 2;
	protected int nivelMaximo = 2;
	protected int nivelActual = 1;
	
	
	//Atributos de instancia ndeahh re IPOO.
	protected PositionList<Entidad> entidades;
	protected PositionList<Position<Entidad>> aBorrar;
	protected PositionList<Entidad> aInsertar;

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
 		
 		
 		
 		
 		// PARA NIVELES
 		/*
 		 * Si la lista esta vacia y no hay más enmigos en entidades, termino nivel; (Controlo con entero que no sea el ultimo nivel);
 		 * sino carga el siguiente nivel; ++nivelActual;
 		 */
 		boolean enemigos = false;
 		
 		

 		if(nivel.isEmpty() && !enemigos) {
 			if(nivelActual == nivelMaximo) {
 				ganarJuego();
 			}
 			else {
 				++nivelActual;
 	 	 		generarNivel();			
 			}
 		}	
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

	public void generarNivel() {
		// Consite en generar 3 oleadas, con +2 enemigos en cada una;
		
		nivel = null; // Limpio lista por las dudas;
		
		for(int i = 0; i < 3; i++) {
			generarOleada();
			nivel.addLast(null); // Esta la bandera
			cantEnemigos = cantEnemigos + 2;
		}
		
		
		
	}
	
	private void generarOleada() {
		int numEnemigo = 0;
		Entidad enemigo = null; // Enemigo a meter a la lista;
		
		Random r = new Random();		
		
		for(int i = 0; i < cantEnemigos; i++) {
		
			numEnemigo = r.nextInt(5);
			switch(numEnemigo) {
				case(0):{
					enemigo = new Colmena(this);
					break;
				}
				case(1):{
					enemigo = new Colmena(this);
					break;
				}
				case(2):{
					enemigo = new Colmena(this);
					break;
				}
				case(3):{
					enemigo = new Colmena(this);
					break;
				}
				case(4):{
					enemigo = new Colmena(this);
					break;
				}
			}
			
			nivel.addLast(enemigo);
		}	
	}
	
	public void ganarJuego() {}
	
}
