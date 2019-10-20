package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;


public class Comprando extends EstadoJuego{

	public Comprando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		
		int xx = (((x - 233) * 10)/ 841);
		int yy = (((y - 42) * 6)/ 487);
		
		Entidad e = mapaLogico.getTienda().getComprado();
//		//SE SETEA COORDENADAS GRAFICAS "NORMALIZADAS"
		e.setX(((xx * 841) / 10 ) + 233);
		e.setY(((yy * 487) / 6) + 42 );
		mapaLogico.insertar(e);
		mapaLogico.setEstado(new Jugando(mapaLogico));

	}



}
