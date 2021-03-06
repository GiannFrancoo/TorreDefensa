package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteMagia;

public class Jugando extends EstadoJuego{
	
	public Jugando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		//Aca no se hace nada ya que mientras se esta jugando no hay interaccion con la tienda
		//ni la grilla.
		
		Visitante visMagia = new VisitanteMagia(this.mapaLogico);
		for(Entidad e: this.mapaLogico.getListaEntidades()) {
			if((x >= e.getX() && x <= e.getX()+e.getAncho()) &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				e.visitar(visMagia);
			}
			if(mapaLogico.getMagia() != null) { // Asi no agarra varias;
				
				this.mapaLogico.getMapaGUI().mostrarColocarMagia();
				
				this.mapaLogico.setEstado(new AplicarMagia(this.mapaLogico));
				break;
			}
		}
		
	}

}
