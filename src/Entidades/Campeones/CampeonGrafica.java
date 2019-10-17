package Entidades.Campeones;

import Entidades.EntidadGrafica;
import Main.MapaLogico;

public abstract class CampeonGrafica extends EntidadGrafica {

	public CampeonGrafica(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public abstract void golpear();
	public abstract void recibirGolpe();
	
}
