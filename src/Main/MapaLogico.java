package Main;
import java.util.List;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

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
	
//	public void Eliminar(Pair<Integer,Integer>  pos) {}
	
// 	public void mover() {}
	
//	public void aplicarMagia(Pair<Integer,Integer> p, Magia m) {
//		
//	}
}
