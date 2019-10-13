package Main;

import Entidades.Entidad;


public class Comprando extends EstadoJuego{

	
	public void actua(MapaLogico m, int x, int y) {
		
		int xx = (((x - 233) * 10)/ 841);
		int yy = (((y - 42) * 6)/ 487);
	
		Entidad e = m.tienda.getComprado();
//		//SE SETEA COORDENADAS GRAFICAS "NORMALIZADAS"
		e.setX(((xx * 841) / 10 ) + 233);
		e.setY(((yy * 487) / 6) + 42 );
		m.insertar(e);
		m.setEstado(new Jugando());

	}



}
