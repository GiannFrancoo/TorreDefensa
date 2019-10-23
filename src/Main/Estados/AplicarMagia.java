package Main.Estados;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteAplicarMagia;


public class AplicarMagia extends EstadoJuego{

	public AplicarMagia(MapaLogico mapaLogico) {
		super(mapaLogico);
	}

	public void actua(int x, int y) {		
		Visitante visMagia = new VisitanteAplicarMagia(this.mapaLogico.getMagia());
		for(Entidad e: this.mapaLogico.getListaEntidades()) {
			e.visitar(visMagia);
		}
		this.mapaLogico.getMapaGUI().remover(this.mapaLogico.getMagia().getGrafica());
		this.mapaLogico.setMagia(null);
	}

}
