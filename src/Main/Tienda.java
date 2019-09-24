package Main;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lazaro;

public class Tienda {
	
	private Entidad [] arreglo;
	private Jugador jugador;
	private MapaLogico mapaLogico;
	private Entidad comprado;
	
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		this.jugador = jugador;
	}
	
	public void comprar(int codigo) {
//		jugador.disminuirMonedas(arreglo[codigo].getMonedas());
		mapaLogico.setEstado("comprando");
		jugador.disminuirMonedas(5);
		
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
