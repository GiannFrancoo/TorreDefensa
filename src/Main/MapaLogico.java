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
	
	public void accionar(int x, int y) {
		//vendiendo, jugando, comprando.
		if(estadoJuego.equals("comprando")) {
			//SE PASA DE COORDENADAS GRAFICAS A COORDENADAS LOGICAS
			int xx = (((x - 233) * 10)/ 841);
			int yy = (((y - 42) * 6)/ 487);
			
			Entidad e = tienda.getComprado();
			//SE SETEA COORDENADAS GRAFICAS "NORMALIZADAS"
			e.setX(((xx * 841) / 10 ) + 233);
			e.setY(((yy * 487) / 6) + 42 );
			
			mapaGUI.insertar(e.getGrafica());
			
			this.entidades.addLast(e);
			try {
				e.setPosEnLista(this.entidades.last());
			} catch (EmptyListException e1) { 
				e1.printStackTrace();
			}
			estadoJuego = ("jugando");
		}
		
		if(estadoJuego.equals("vendiendo")) {
			this.eliminar(x, y);
			estadoJuego = ("jugando");

		}
		
		//Si llega a este punto es porque esta en el estado jugando("Aqui no paso nada").
		
	}
	
	public boolean disponible(Pair<Integer,Integer> pos) {
		//Retorna true si en esa posicion no existe ninguna entidad.
		 return true;
	}
	
	public void recibir(Aliado a) {	
		
	}
	
	public void recibir(Enemigo e) {
		
	}
	
	public void insertar(Entidad e) {
		this.entidades.addLast(e);
		try {
			e.setPosEnLista(this.entidades.last());
		} catch (EmptyListException e1) {
			e1.printStackTrace();
		}
		/////NO SE SI SE VA A QUEDAR, ES PARA PRUEBA////////////////////////////////////////////////////////////////////////////////////////////////////////
		mapaGUI.insertar(e.getGrafica());
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
	
	public void eliminar(int x, int y) {
		for(Entidad e: this.entidades) {
			if ((x >= e.getX() && x <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				e.visitado(new VisitarEnemigo(this));	
			}
		}
		
	}
	
	//eliminarPosta: Metodo que se encarga de eliminar la entidad en la lista.
	public void eliminarPosta(Position<Entidad> pos) {
		mapaGUI.remover(pos.element().getGrafica());
		try {
			this.entidades.remove(pos);
		} catch (InvalidPositionException e) {
			e.printStackTrace();
		}
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
