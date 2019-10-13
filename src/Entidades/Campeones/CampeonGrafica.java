package Entidades.Campeones;

import Entidades.EntidadGrafica;

public abstract class CampeonGrafica extends EntidadGrafica {

	public CampeonGrafica() {
		super();
	}
	
	public abstract void golpear();
	public abstract void recibirGolpe();
	
}
