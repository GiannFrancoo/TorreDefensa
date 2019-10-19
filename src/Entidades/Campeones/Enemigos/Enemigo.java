package Entidades.Campeones.Enemigos;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	
	public Enemigo(MapaLogico m) {
		super(m);
	}
	
	public void mover() {
		this.setX(x-velocidad);
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
	
}
