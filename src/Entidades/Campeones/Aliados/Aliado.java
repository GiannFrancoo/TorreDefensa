package Entidades.Campeones.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Utilidad.Lista.Position;

public abstract class Aliado extends Campeon{
	
	
	public Aliado(MapaLogico m) {
		super(m);
	}
	
	public void accionar() {
		this.intentarDisparar();
	}
	
	public void intentarDisparar() {
		
		//falta;
		
	}
	
	public abstract DisparoAliado disparar();
	

}
