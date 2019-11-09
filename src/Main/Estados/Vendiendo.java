package Main.Estados;


import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.VisitanteVender;

public class Vendiendo extends EstadoJuego{

	private VisitanteVender visitante;
	
	public Vendiendo(MapaLogico mapaLogico) {
		super(mapaLogico);
		this.visitante = new VisitanteVender(mapaLogico.getTienda());
	}
	
	public void actua(int x, int y) {
		for(Entidad e: mapaLogico.getListaEntidades()) {
			if((x >= e.getX() && x <= e.getX()+e.getAncho()) &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				e.visitar(visitante);
			}
		}
		
		mapaLogico.getMapaGUI().ocultarIndicacion();
		
		mapaLogico.setEstado(new Jugando(mapaLogico));
	}


	
}
