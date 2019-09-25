package Entidades.Campeones.Aliados;

import Entidades.Campeones.Campeon;
import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;

public abstract class Aliado extends Campeon{
		
	public Aliado(MapaLogico m) {
		super(m);
	}
	
	public abstract DisparoAliado disparar();

}
