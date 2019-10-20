package Entidades.Campeones.Enemigos.EnemigosMelee;

import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteMovimientoEnemigo;

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
	
	public void intentarDisparar() {
		this.golpear();
	}
	
}
