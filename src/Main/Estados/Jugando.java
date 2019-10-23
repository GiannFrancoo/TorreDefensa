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
			e.visitar(visMagia);
		}
		
		this.mapaLogico.setEstado(new AplicarMagia(this.mapaLogico));
	}

}
