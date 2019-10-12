package Main;

import Entidades.Entidad;
import Utilidad.Pair;

public class Comprando extends EstadoJuego{

	
	public void actua(int x, int y, MapaLogico m) {
		//SE PASA DE COORDENADAS GRAFICAS A COORDENADAS LOGICAS
		int xx = (((x - 233) * 10)/ 841);
		int yy = (((y - 42) * 6)/ 487);
		
		
		//e es la entidad que la hereda de EstadoJuego.
		//SE SETEA COORDENADAS GRAFICAS "NORMALIZADAS"
		e.setX(((xx * 841) / 10 ) + 233);
		e.setY(((yy * 487) / 6) + 42 );
		
		m.insertar(e);
		//Ahora cambio el estado de juego a "jugando con esta".
		m.setEstado(this.jugando);
	}

	public void vender() {
		
		
	}


	@Override
	public void comprar(int codigo, Pair<Integer, Integer>[] arreglo, Jugador jugador, Entidad comprado) {
		// TODO Auto-generated method stub
		
	}
	
	//int xx = (((x - 233) * 10)/ 841);
	//int yy = (((y - 42) * 6)/ 487);
	
	//Entidad e = tienda.getComprado();
	
	//e.setX(((xx * 841) / 10 ) + 233);
	//e.setY(((yy * 487) / 6) + 42 );
	
	//this.insertar(e);
	
	//estadoJuego = ("jugando");
}
