package Main;

import Entidades.Entidad;
import Utilidad.Pair;

public class Vendiendo extends EstadoJuego{

	
	public void actua(int x, int y, MapaLogico m) {
		
		m.eliminar(x, y);
		m.setEstado(this.jugando);
	}
	
	public void vender() {
		
		
	}


	@Override
	public void comprar(int codigo, Pair<Integer, Integer>[] arreglo, Jugador jugador, Entidad comprado) {
		// TODO Auto-generated method stub
		
	}
	
}
