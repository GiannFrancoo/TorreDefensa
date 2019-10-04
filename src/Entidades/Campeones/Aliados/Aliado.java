package Entidades.Campeones.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Utilidad.Lista.Position;

public abstract class Aliado extends Campeon{
	
	protected Position<Entidad> posEnLista;
	
	public Aliado(MapaLogico m) {
		super(m);
	}
	
	public abstract DisparoAliado disparar();
	
	public int getMonedas() {
		return this.monedas;
	}

	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}
	
	

}
