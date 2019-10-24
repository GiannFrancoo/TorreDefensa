package Entidades.Campeones.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteAlcanceGolpeA_Enemigo;
import Main.Visitantes.VisitanteMeleeA_Enemigo;
import Utilidad.Lista.PositionList;

public abstract class Aliado extends Campeon{
	
	public Aliado(MapaLogico m) {
		super(m);
		drop = null; // Aliado no tiene drops;
		this.visitante = new VisitanteMeleeA_Enemigo(this);
		this.visitanteAlcance = new VisitanteAlcanceGolpeA_Enemigo(this);
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarGolpear();
		}
	}
	
	public void intentarGolpear() {
		if (this.dpsTiming == 0) {
			PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(x, x + this.rango + this.getAncho(), y);
			for (Entidad e : listaColisionados) {
				if (this.dpsTiming == 0) {
					e.visitar(visitanteAlcance);
				} 
				else {
					break;
				}
			}
		}
		else {
			--this.dpsTiming;
		}
	}
	
	public void golpearMelee() {
		this.dpsTiming = dps;
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(x, x + this.rango + this.getAncho(), y);
		for (Entidad e : listaColisionados) {
			e.visitar(visitante);
		}
		this.entidadGrafica.golpearMelee();
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
}