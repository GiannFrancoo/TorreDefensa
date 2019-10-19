package Main.Estados;


import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;

public class Vendiendo extends EstadoJuego{

	
	public void actua(MapaLogico m, int x, int y) {
		//LLAMAR A VISITOR DE ALIADOS Y BARRICADAS
		for(Entidad e: m.getListaEntidades()) {
			if((x >= e.getX() && x <= e.getX()+e.getAncho()) &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				if(e.visitar(new VisitanteB_Aliado())) {
					m.getTienda().vender((Aliado) e);
					m.eliminar(e.getPosEnLista());
					break;
				}
			}
		}
		
		m.setEstado(new Jugando());
	}


	
}
