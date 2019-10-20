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
	protected PositionList<Position<Entidad>> aBorrar;
	protected PositionList<Entidad> aInsertar;

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
		aBorrar = new DoubleLinkedList<Position<Entidad>>();
		aInsertar = new DoubleLinkedList<Entidad>();
		estadoJuego = new Jugando(this);
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
	
	//eliminarPosta: Metodo que se encarga de eliminar la entidad en la lista.
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
	
	public MapaGUI getMapaGUI() {
		return mapaGUI;
	}
	
}
