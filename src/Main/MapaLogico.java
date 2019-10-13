package Main;

import Utilidad.Lista.*;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.Tienda.Tienda;
import Utilidad.Pair;

public class MapaLogico {
	
	//Atributos de instancia ndeahh re IPOO.
	protected PositionList<Entidad> entidades;
	protected PositionList<Entidad> aBorrar;
	protected Tienda tienda;
	protected Jugador jugador;
	private EstadoJuego estadoJuego;
	private MapaGUI mapaGUI;
	
	public MapaLogico() {
		this.jugador = new Jugador(100);
		this.tienda = new Tienda(this, jugador);
		this.mapaGUI = new MapaGUI(this, tienda, jugador);
		mapaGUI.setVisible(true);
		entidades = new DoubleLinkedList<Entidad>();
		aBorrar = new DoubleLinkedList<Entidad>();
		estadoJuego = new Jugando();
	}
	
	
	public void setEstado(EstadoJuego e) {
		this.estadoJuego = e;
	}
	
	public void accionar(int x, int y) {
		this.estadoJuego.actua(this, x, y); //Delego todo el quilombo al patron electoral.
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
		mapaGUI.insertar(e.getGrafica());
	}
	
	public void eliminar(int x, int y) {
//		VisitanteDisparo visitante = new VisitarEnemigo(this);
//		for(Entidad e: this.entidades) {
//			if ((x >= e.getX() && x <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
//				e.visitado(visitante);	
//			}
//		}
		
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
			e.accionar();
 		}
 		
	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.agregarMagia(m);
	}
	
	void colisione(){
		
	}
	
	public PositionList<Entidad> colisione(int x, int y) {
		//Recorro todas las entidades, y voy viendo si X >= x entonces ahi colisione
		//PRUEBA: SOLO VA A DETECTAR COLISIONES CON ALIADOS
		VisitanteDisparo visitante = new VisitarAliado();
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			if ((x >= e.getX() && x <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				//e.visitado(visitante);	
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
		//return null;
	}
	
}
