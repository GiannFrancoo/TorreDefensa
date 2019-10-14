package Entidades.Campeones.Enemigos.EnemigosRango;

import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;

public abstract class EnemigoRango extends Enemigo {

	protected int rango;
	
	public EnemigoRango(MapaLogico m) {
		super(m);
	}
	
	public int getRango() {
		return rango;
	}

}
