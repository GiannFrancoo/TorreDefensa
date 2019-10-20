package Entidades.Campeones.Enemigos.EnemigosMelee;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteMovimientoEnemigo;
import Utilidad.Lista.PositionList;

public abstract class EnemigoMelee extends Enemigo {

	public EnemigoMelee(MapaLogico m) {
		super(m);
		this.visitante = new VisitanteMovimientoEnemigo(this);
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			//this.intentarDisparar();
		}
	}

	//VER MOVIMIENTO
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		
		for(Entidad e: listaColisionados) {
			e.visitar(visitante);
		}
	}
	
	public void intentarDisparar() {
		this.golpear();
	//}
	
}
