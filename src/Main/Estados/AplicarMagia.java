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
		
		// Buscar al primero aliado con esas coordenadas, para ponerle la magia;
		for(Entidad e: mapaLogico.getListaEntidades()) {
			if((x >= e.getX() && x <= e.getX()+e.getAncho()) &&  (y >= e.getY() && y <= e.getY()+e.getAlto())) {
				e.visitar(visMagia);
			}
		}
		
		//Podrias ponerle más eficiencia, si metes un break, pero haciendo la magia nula en el visitor;
		if (this.mapaLogico.getMagia() != null) {
			this.mapaLogico.getMapaGUI().remover(this.mapaLogico.getMagia().getGrafica()); // Sacas el drop!
			this.mapaLogico.setMagia(null); // Volves a la magia null;			
		}
		
		this.mapaLogico.getMapaGUI().ocultarIndicacion();
		
		this.mapaLogico.setEstado(new Jugando(this.mapaLogico)); // Setea de nuevo el mapa;
	}

}
