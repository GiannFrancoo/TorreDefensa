package Main;
import java.util.List;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.Magias.Magia;

import java.util.Iterator;
import java.util.LinkedList;
import Utilidad.Pair;

public class MapaLogico {
	
	//Atributos de instancia ndeahh re IPOO.
	protected List<Entidad> entidades [][];
	protected List<Aliado> aliados;
	protected List<Enemigo> enemigos;
	protected List<Objeto> objetos;
	protected Tienda tienda;
	protected Jugador jugador;


	public MapaLogico(int f, int c) {
		
		entidades = (List<Entidad>[][]) new List[f][c];
		
		for(int i = 0; f < entidades.length; i++) {
			for(int j = 0; c < entidades[0].length; j++) {
				entidades[i][j] = new LinkedList<Entidad>(); 
			}
		}
		aliados = new LinkedList<Aliado>();
		enemigos = new LinkedList<Enemigo>();
		tienda = new Tienda();
		jugador = new Jugador(100);
	}
	
	public boolean Disponible(Pair<Integer,Integer> pos) {
		 if(entidades[pos.getKey()][pos.getValue()].isEmpty()) {
			 return true;
		 }
		 //Si no esta vacia la lista hay que ver que entidad hay en esa posicion en la matriz.
		 return false;
	}
	
	
//	public void Recibir(Pair<Integer,Integer> p) {	}
	
//	public void Recibir(PPair<Integer,Integer> p) {}
	
	public void Insertar(Pair<Integer,Integer> p, Objeto o) {
			entidades[p.getKey()][p.getValue()].add(o);
			objetos.add(o);
	}
	
	public void Insertar(Pair<Integer,Integer> p, Aliado a) {
			entidades[p.getKey()][p.getValue()].add(a);
			aliados.add(a);
	}
	
	//Eliminar: Metodo que se encarga de eliminar la entidad en la posicion pasada por parametro.
		public void Eliminar(Pair<Integer,Integer> pos, Entidad e) {
			//Borro la entidad de la lista, no hace falta verificar si la lista esta vacia.
			int posEliminar = entidades[pos.getKey()][pos.getValue()].indexOf(e);
			entidades[pos.getKey()][pos.getValue()].remove(posEliminar);
		}
	
	
//	public int venderAliado(Pair<Integer,Integer>  pos) {
//			//Vender: este metodo es para cuando el usuario quiere sacar un aliado o objeto del juego(Hay q ver cuanto dinero se le devuelve al jugador).
//			//---------------------------------------------------------//
//			//hay que ver la cantidad de plata a devolver a Jugador(Si esta dañado se le devuelve la mitad, sino el dinero completo).
//			entidades[pos.getKey()][pos.getValue()]
//	}
//	
//	public int venderObjeto(Pair<Integer,Integer> pos) {
//		
//	}
	
// 	public void Mover() {
//		
//	}
	
	//AplicarMagia: Metodo que aplica la magia a la entidad pasada por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.
	}
}
