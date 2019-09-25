package Entidades.Campeones.Enemigos;

import Entidades.Campeones.Campeon;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	
	public Enemigo(MapaLogico m) {
		super(m);
	}

	
	public abstract void mover();	
	public abstract DisparoEnemigo disparar();
	
	
}
