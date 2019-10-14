package Entidades.Disparos;

import Entidades.Entidad;
import Main.MapaLogico;

public abstract class Disparo extends Entidad{
	
	protected int fuerza;
	protected int velocidad;

	public Disparo(MapaLogico m) {
		super(m);
		this.alto = 75;
		this.ancho = 75;
		this.velocidad = 5; //En la que recorre el mapa;
	}

	public int getFuerza() {
		return fuerza;
	}
	
	public abstract void mover();

	
}
