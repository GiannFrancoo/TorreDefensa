package Main;

import javax.swing.JPanel;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lazaro;
import Utilidad.Pair;

public class Tienda {
	
	private Pair<Entidad,Integer> [] arreglo;
	private Jugador jugador;
	private MapaLogico mapaLogico;
	private Entidad comprado;
	private TiendaGrafica tiendaGrafica;
	
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		this.jugador = jugador;
		
		tiendaGrafica = new TiendaGrafica(mapaLogico, this);
		tiendaGrafica.actualizarMonedas(jugador.getMonedas());
		
		arreglo = (Pair<Entidad, Integer>[])new Pair[10];
		//Creacion de 10 entidades; (Puede ser por archivo);
	}
	
	public void comprar(int codigo) {
		
		//Se chequea si jugador tiene la moneda para comprarlo;
		if (jugador.getMonedas() >= arreglo[codigo].getValue()) {
			
			mapaLogico.setEstado("comprando"); // Cambio el estado;
			
			comprado = arreglo[codigo].getKey(); // Habria que hacer una copia; y lo guardo en el atributo;
			
			jugador.disminuirMonedas(arreglo[codigo].getValue());
			
		}
				
	}
	
	public void vender(Entidad e) {
		//Chequea que no sea un enemigo;
		//y despues hace todo;
		
	}
	
	
	public Entidad getComprado() {
		return this.comprado;
	}
	
	public void setComprado(Entidad e) {
		this.comprado = e;
	}
	
	public TiendaGrafica getGrafica() {
		return tiendaGrafica;
	}
	
	
	
	//public Tienda() {}
	//public Entidad comprar(int n);
	//public void vender(Aliado a);
	//public void vender(Objeto o);

}
