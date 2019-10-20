package Entidades.Campeones.Enemigos.EnemigosRango;

import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteMovimientoEnemigo;

public abstract class EnemigoRango extends Enemigo {
	
	public EnemigoRango(MapaLogico m) {
		super(m);
		this.visitante = new VisitanteMovimientoEnemigo(this);
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			//this.intentarGolpear();
		}
	}
	
	

}
