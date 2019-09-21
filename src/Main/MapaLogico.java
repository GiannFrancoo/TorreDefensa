package Main;
import java.util.List;

import Utilidad.Lista.*;
import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.Magias.Magia;

import Utilidad.Pair;

public class MapaLogico {
	
	//Atributos de instancia ndeahh re IPOO.
	protected PositionList<Entidad> entidades;
	protected Tienda tienda;
	protected Jugador jugador;
	private String estadoJuego;
	private Visitante visitante;
	
	public MapaLogico() {		
		entidades = new DoubleLinkedList<Entidad>();
		jugador = new Jugador(100);
		tienda = new Tienda(this, jugador);
	}
	
	
	public void setEstado(String s) {
		estadoJuego = s;
	}
	
	public boolean disponible(Pair<Integer,Integer> pos) {
		//Retorna true si en esa posicion no existe ninguna entidad.
//		for(Aliado a: this.aliados) {
//			if( (a.getPos().getKey() == pos.getKey()) && (a.getPos().getValue() == pos.getValue())) {
//				return false;
//			}
//		}
//		
//		for(Enemigo e: this.enemigos) {
//			if( (e.getPos().getKey() == pos.getKey()) && (e.getPos().getValue() == pos.getValue())) {
//				return false;
//			}
//		}
//		
//		for(Objeto o: this.objetos) {
//			if( (o.getPos().getKey() == pos.getKey()) && (o.getPos().getValue() == pos.getValue())) {
//				return false;
//			}
//		}
		
		 return true;
	}
	
	public void recibir(Aliado a) {	
		
	}
	
	public void recibir(Enemigo e) {
		
	}
	
	public void insertar(Pair<Integer,Integer> p, Entidad e) {
		this.entidades.addLast(e);
	}
	
	//Eliminar: Metodo que se encarga de eliminar la entidad en la lista.
	public void eliminar(Pair<Integer,Integer> pos) {
		for(Entidad e: this.entidades) {
			if(pos.getKey().equals(e.getPos().getKey()) && pos.getValue().equals(e.getPos().getValue())) {
				e.visitado(visitante);	
			}
		}
		
	}
	
	public void eliminarPosta(Entidad e) {
		//this.entidades.remove();
	}
	
	public void accionar(String s) {
		//vendiendo, jugando, comprando.
		if(s.equals("comprando")) {
			
		}
		
		if(s.equals("vendiendo")) {
			
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
	
}
