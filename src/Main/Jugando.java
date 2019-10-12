package Main;

import Entidades.Entidad;
import Utilidad.Pair;

public class Jugando extends EstadoJuego{

	@Override
	public void actua(int x, int y, MapaLogico m) {
		
		
	}

	
	public void comprar(int codigo, Pair<Integer,Integer> [] arreglo, Jugador jugador, Entidad comprado) {
		//Se chequea si jugador tiene la moneda para comprarlo;
		if (jugador.getMonedas() >= arreglo[codigo].getValue()) {
			
			m.setEstado(this.comprando); // Cambio el estado;
			
			comprado = arreglo[codigo].getKey(); // Habria que hacer una copia; y lo guardo en el atributo;
			
			jugador.disminuirMonedas(arreglo[codigo].getValue());		
		}	
	}
	
	@Override
	public void vender() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
