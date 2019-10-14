package Entidades.Campeones.Enemigos;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	
	public Enemigo(MapaLogico m) {
		super(m);
	}
	
	public void mover() {
		this.setX(x-velocidad);
	}
	
}
