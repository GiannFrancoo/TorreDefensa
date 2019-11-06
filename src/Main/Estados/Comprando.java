package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;


public class Comprando extends EstadoJuego{

	public Comprando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		//Comprobar que no haya otra entidad
		
		
		int xx = (((x - 233) * 10)/ 841);
		int yy = (((y - 42) * 6)/ 487);
		
		//if() {
			
			
		//}
		
		Entidad e = mapaLogico.getTienda().getComprado();
		e.setX(((xx * 841) / 10 ) + 233);
		e.setY(((yy * 487) / 6) + 42 );
		mapaLogico.getJugador().disminuirMonedas(e.getMonedas());
		mapaLogico.getTienda().actualizarMonedas();
		mapaLogico.getTienda().actualizarTienda();
		mapaLogico.insertar(e);
		//Si lo puede poner se setea la nueva compra a la tienda
		mapaLogico.getTienda().setComprado(e);
		mapaLogico.setEstado(new Jugando(mapaLogico));

	}



}
