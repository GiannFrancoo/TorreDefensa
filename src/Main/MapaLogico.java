package Main;

import Utilidad.Lista.*;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.Estados.EstadoJuego;
import Main.Estados.Jugando;
import Main.Tienda.Tienda;

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
	
	public PositionList<Entidad> getListaEntidades(){
		return entidades;
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
	
	public PositionList<Entidad> colisioneDerecha(int x, int y, int ancho) {
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			if ((x+ancho >= e.getX() && x+ancho <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
	}
	
	public PositionList<Entidad> colisioneIzquierda(int x, int y) {
		PositionList<Entidad> listaColisionados = new DoubleLinkedList<Entidad>();
		for(Entidad e: this.entidades) {
			if ((x >= e.getX() && x <= e.getX()+e.getAncho())  &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				listaColisionados.addLast(e);
			}
		}
		return listaColisionados;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
}
