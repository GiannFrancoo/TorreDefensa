package Main;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lazaro;
import Utilidad.Pair;

public class Tienda {
	
	private Pair<Entidad,Integer> [] arreglo;
	private Jugador jugador;
	private MapaLogico mapaLogico;
	private Entidad comprado;
	
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		this.jugador = jugador;
		
		arreglo = (Pair<Entidad, Integer>[])new Pair[10];
		//Creacion de 10 entidades; (Puede ser por archivo);
	}
	
	public void comprar(int codigo) {
		
		//Se chequea si jugador tiene la moneda para comprarlo;
		
		
		mapaLogico.setEstado("comprando");

		
		//arreglo[codigo]; //Hago un copy de eso; [Prototype]
		
		
		jugador.disminuirMonedas(100);

		//entidad = a la copia de eso;
		
		
		
		
	}
	
	public void vender() {
		
	}
	
	public Entidad getComprado() {
		return comprado;
	}
	
	//public Tienda() {}
	//public Entidad comprar(int n);
	//public void vender(Aliado a);
	//public void vender(Objeto o);

}
