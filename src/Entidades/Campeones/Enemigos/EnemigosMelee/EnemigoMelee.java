package Entidades.Campeones.Enemigos.EnemigosMelee;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.VisitanteB_Barricada;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public abstract class EnemigoMelee extends Enemigo {

	public EnemigoMelee(MapaLogico m) {
		super(m);
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			//this.intentarDisparar();
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
	
	public void intentarDisparar() {
		this.golpear();
	}
	
}
