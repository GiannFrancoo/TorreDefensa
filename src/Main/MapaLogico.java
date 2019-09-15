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
	protected PositionList<Aliado> aliados;
	protected PositionList<Enemigo> enemigos;
	protected PositionList<Objeto> objetos;
	protected Tienda tienda;
	protected Jugador jugador;


	public MapaLogico() {		
		aliados = new DoubleLinkedList<Aliado>();
		enemigos = new DoubleLinkedList<Enemigo>();
		objetos = new DoubleLinkedList<Objeto>();
		tienda = new Tienda();
		jugador = new Jugador(100);
	}
	
	public boolean Disponible(Pair<Integer,Integer> pos) {
		//Retorna true si en esa posicion no existe ninguna entidad.
		for(Aliado a: this.aliados) {
			if( (a.getPos().getKey() == pos.getKey()) && (a.getPos().getValue() == pos.getValue())) {
				return false;
			}
		}
		
		for(Enemigo e: this.enemigos) {
			if( (e.getPos().getKey() == pos.getKey()) && (e.getPos().getValue() == pos.getValue())) {
				return false;
			}
		}
		
		for(Objeto o: this.objetos) {
			if( (o.getPos().getKey() == pos.getKey()) && (o.getPos().getValue() == pos.getValue())) {
				return false;
			}
		}
		
		 return true;
	}
	
	public void Recibir(Aliado a) {	
		
	}
	
	public void Recibir(Enemigo e) {
		
	}
	
	public void Insertar(Pair<Integer,Integer> p, Objeto o) {
		this.objetos.addLast(o);
	}
	
	public void Insertar(Pair<Integer,Integer> p, Aliado a) {
		this.aliados.addLast(a);
	}
	
	//Eliminar: Metodo que se encarga de eliminar la entidad en la lista.
	public void Eliminar(Pair<Integer,Integer> pos, Aliado a) {
		for(Position<Aliado> posA: this.aliados.positions()) {
			if( (posA.element().getPos().getKey() == pos.getKey()) && (posA.element().getPos().getValue() == pos.getValue()) ) {
				try {
					this.aliados.remove(posA);
				} catch (InvalidPositionException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void Eliminar(Pair<Integer,Integer> pos, Enemigo e) {
		for(Position<Enemigo> posE: this.enemigos.positions()) {
			if( (posE.element().getPos().getKey() == pos.getKey()) && (posE.element().getPos().getValue() == pos.getValue()) ) {
				try {
					this.enemigos.remove(posE);
				} catch (InvalidPositionException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	public void Eliminar(Pair<Integer,Integer> pos, Objeto o) {
		for(Position<Objeto> posO: this.objetos.positions()) {
			if( (posO.element().getPos().getKey() == pos.getKey()) && (posO.element().getPos().getValue() == pos.getValue()) ) {
				try {
					this.objetos.remove(posO);
				} catch (InvalidPositionException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
 	public void Mover() {
		
	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.agregarMagia(m);
	}
	
}
