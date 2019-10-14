package Entidades.Campeones.Aliados.AliadosRango;

import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;

public abstract class AliadoRango extends Aliado {

	protected int rango;
	
	public AliadoRango(MapaLogico m) {
		super(m);
	}
	
	public int getRango() {
		return rango;
	}

}
