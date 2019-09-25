package Main;

import Utilidad.Lista.*;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;

import Utilidad.Pair;

public class MapaLogico {
	
	//Atributos de instancia ndeahh re IPOO.
	protected PositionList<Entidad> entidades;
	protected Tienda tienda;
	protected Jugador jugador;
	private String estadoJuego;
	private MapaGUI mapaGUI;
	private VisitanteDisparo visitante;
	
	public MapaLogico() {
		this.jugador = new Jugador(100);
		this.tienda = new Tienda(this, jugador);
		this.mapaGUI = new MapaGUI(this, tienda, jugador);
		mapaGUI.setVisible(true);
		entidades = new DoubleLinkedList<Entidad>();
	}
	
	
	public void setEstado(String s) {
		estadoJuego = s;
	}
	
	public boolean disponible(Pair<Integer,Integer> pos) {
		//Retorna true si en esa posicion no existe ninguna entidad.
		 return true;
	}
	
	public void recibir(Aliado a) {	
		
	}
	
	public void recibir(Enemigo e) {
		
	}
	
	public void insertar(Pair<Integer,Integer> p, Entidad e) {
		this.entidades.addLast(e);
		try {
			e.setPosEnLista(this.entidades.last());
		} catch (EmptyListException e1) {
			e1.printStackTrace();
		}
	}
	
	public void eliminar(Pair<Integer,Integer> pos) {
		for(Entidad e: this.entidades) {
			if(pos.getKey().equals(e.getX()) && pos.getValue().equals(e.getY())) {
				e.visitado(visitante);	
			}
		}
		
	}
	//eliminarPosta: Metodo que se encarga de eliminar la entidad en la lista.
	public void eliminarPosta(Position<Entidad> pos) {
		try {
			this.entidades.remove(pos);
		} catch (InvalidPositionException e) {
			e.printStackTrace();
		}
	}
	
	public void accionar(int x, int y) {
		//vendiendo, jugando, comprando.
		if(estadoJuego.equals("comprando")) {
			
	
			Entidad e = tienda.getComprado();
			e.setX(((x * 841) / 10 ) + 233);
			e.setY(((y * 487) / 6) + 42 );

			mapaGUI.insertar(e.getGrafica());
			
			this.entidades.addLast(e);
			try {
				e.setPosEnLista(this.entidades.last());
			} catch (EmptyListException e1) { System.out.println("Se partio el hilo");}
			
			
			
			estadoJuego = ("jugando");
		
		}
		
		if(estadoJuego.equals("vendiendo")) {
			
		}
		
		//Si llega a este punto es porque esta en el estado jugando("Aqui no paso nada").
		
	}
		
 	public void actualizar() {
 		//Recorre toda la lista y llamo a los accionar de las clases.
 		for(Entidad e: entidades) {
			e.mover();
 		}
 		
	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.agregarMagia(m);
	}
	
	
	public boolean colisione(int x, int y) {
		//Recorro todas las entidades, y voy viendo si X >= x entonces ahi colisione
		return false;
	}
	
}
