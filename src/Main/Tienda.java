package Main;

import Entidades.Entidad;

public class Tienda {
	
	private Entidad [] arreglo;
	private Jugador jugador;
	private MapaLogico mapaLogico;
	
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		this.jugador = jugador;
	}
	
	public void comprar(int codigo) {
//		jugador.disminuirMonedas(arreglo[codigo].getPrecio());
		mapaLogico.setEstado("comprando");
		jugador.disminuirMonedas(5);
	}
	
	public void vender() {
		
	}
	
	//public Tienda() {}
	//public Entidad comprar(int n);
	//public void vender(Aliado a);
	//public void vender(Objeto o);

}
