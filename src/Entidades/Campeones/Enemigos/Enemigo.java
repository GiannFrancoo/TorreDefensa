package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteAlcanceGolpeA_Aliado;
import Main.Visitantes.VisitanteMeleeA_Aliado;
import Main.Visitantes.VisitanteMovimientoEnemigo;
import Utilidad.Lista.PositionList;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	protected boolean puedoMoverme;
	protected Visitante visitanteMelee;
	
	public Enemigo(MapaLogico m) {
		super(m);
		this.puedoMoverme = true;
		this.visitanteAlcance = new VisitanteAlcanceGolpeA_Aliado(this);
		this.visitanteMelee = new VisitanteMeleeA_Aliado(this);
		this.visitante = new VisitanteMovimientoEnemigo(this);
	}
	
	public void mover() {
		this.setX(x-velocidad);
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			this.intentarGolpear();
		}
	}
	
	public void setMoverme(boolean b) {
		this.puedoMoverme = b;
	}
	
	public void intentarGolpear() {
		if (this.dpsTiming == 0) {
			PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - this.rango, y);
			for (Entidad e : listaColisionados) {
				if (this.dpsTiming == 0) {
					e.visitar(visitanteAlcance);
				}
			}
			this.dpsTiming = dps;
		}
		else {
			--this.dpsTiming;
		}
	}
	
	public void golpearMelee() {
		
		this.dpsTiming = dps;

//		lilithGrafico.golpear();
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
