package Entidades.Campeones.Enemigos.EnemigosRango;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public abstract class EnemigoRango extends Enemigo {

	protected int rango;
	
	public EnemigoRango(MapaLogico m) {
		super(m);
	}
	
	public int getRango() {
		return rango;
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			//this.intentarGolpear();
		}
	}

	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		Visitante visitante = new VisitanteB_Aliado();
		boolean puedoMoverme = true;
		
		for(Entidad e: listaColisionados) {
			puedoMoverme = !(e.visitar(visitante)); //De vuelve true si es aliado o barrica (Se niega despues);
			if (!puedoMoverme)
				break;
		}
		
		if(puedoMoverme) { // Si se puede mover...
			this.mover();
		}
		
	}
	
	

}
