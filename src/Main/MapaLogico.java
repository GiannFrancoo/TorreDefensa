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
	protected List<Aliado> aliados;
	protected List<Enemigo> enemigos;
	protected List<Objeto> objetos;
	protected Tienda tienda;
	protected Jugador jugador;


	public MapaLogico() {		
		aliados = new LinkedList<Aliado>();
		enemigos = new LinkedList<Enemigo>();
		tienda = new Tienda();
		jugador = new Jugador(100);
	}
	
	public boolean Disponible(Pair<Integer,Integer> pos) {
		 return false;
	}
	
	
	public void Recibir(Aliado a) {	
		
	}
	
	public void Recibir(Enemigo e) {
		
	}
	
	public void Insertar(Pair<Integer,Integer> p, Objeto o) {
	}
	
	public void Insertar(Pair<Integer,Integer> p, Aliado a) {
	}
	
	//Eliminar: Metodo que se encarga de eliminar la entidad en la posicion pasada por parametro.
	public void Eliminar(Pair<Integer,Integer> pos, Entidad e) {
	}
	
		
 	public void Mover() {
		
	}
	
	//AplicarMagia: Metodo que aplica la magia a el campeon pasado por parametro.
	public void aplicarMagia(Campeon c, Magia m) {
		c.agregarMagia(m);
	}
	
}
