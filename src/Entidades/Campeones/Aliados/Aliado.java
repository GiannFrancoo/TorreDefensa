package Entidades.Campeones.Aliados;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;

public abstract class Aliado extends Campeon{
	
	public Aliado(MapaLogico m) {
		super(m);
	}
	
	public void accionar() {
		this.intentarGolpear();
	}
	
}