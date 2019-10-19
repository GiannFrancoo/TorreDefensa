package Entidades.Campeones.Aliados;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Aliado extends Campeon{
	
	public Aliado(MapaLogico m) {
		super(m);
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarGolpear();
		}
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}
}