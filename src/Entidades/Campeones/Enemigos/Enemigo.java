package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	protected boolean puedoMoverme;
	
	public Enemigo(MapaLogico m) {
		super(m);
		this.puedoMoverme = true;
	}
	
	public void mover() {
		this.setX(x-velocidad);
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
	
	public void setMoverme(boolean b) {
		this.puedoMoverme = b;
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		
		for(Entidad e: listaColisionados) {
			e.visitar(visitante);
		}
		if (this.puedoMoverme) {
			mover();
		}
		this.puedoMoverme = true;
		
	}
	
	
	
}
