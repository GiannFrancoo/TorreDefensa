package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteCompra;
import Utilidad.Lista.PositionList;


public class Comprando extends EstadoJuego{
	protected Entidad entidadComprada;
	
	public Comprando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		//Comprobar que no haya otra entidad
		
		
		int xx = (((x - 233) * 10)/ 841);
		int yy = (((y - 42) * 6)/ 487);
		//llamo al visitor para que verifico si donde quiere poner la entidad es un lugar valido.
		
		mapaLogico.getTienda().setCompraValida(true);
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x, y);
		Visitante visitanteCompra = new VisitanteCompra(mapaLogico.getTienda());
		
		for(Entidad e : listaColisionados) {
			e.visitar(visitanteCompra);	
			if(!(mapaLogico.getTienda().getCompraValida()))
				break;
		}	
		
		if(mapaLogico.getTienda().getCompraValida()) {//Si es valida donde quiere colocar la entidad, lo meto.
			Entidad e = mapaLogico.getTienda().getComprado();
			e.setX(((xx * 841) / 10 ) + 233);
			e.setY(((yy * 487) / 6) + 42 );
			mapaLogico.getJugador().disminuirMonedas(e.getMonedas());
			mapaLogico.getTienda().actualizarMonedas();
			mapaLogico.getTienda().actualizarTienda();
			mapaLogico.insertar(e);
		}
		
		//mapaLogico.getTienda().setComprado(null);
		
		
		mapaLogico.setEstado(new Jugando(mapaLogico));

	}



}
