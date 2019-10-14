package Entidades.Campeones.Enemigos.EnemigosRango;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Barricada;
import Main.Visitantes.VisitanteBooleano;
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
		this.intentarMoverse();
		//this.intentarGolpear();
	}

	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		VisitanteBooleano visitante = new VisitanteB_Barricada();
		boolean puedoMoverme = true;
		
		for(Entidad e: listaColisionados) {
			puedoMoverme = !(e.visitadoBooleano(visitante)); //De vuelve true si es aliado o barrica (Se niega despues);
			if (!puedoMoverme)
				break;
		}
		
		if(puedoMoverme) { // Si se puede mover...
			this.mover();
		}
		
	}
	
	

}
