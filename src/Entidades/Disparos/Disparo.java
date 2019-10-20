package Entidades.Disparos;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Disparo extends Entidad{
	
	protected int fuerza;
	protected int rango;
	protected int velocidad;
	protected Visitante visitante;

	public Disparo(MapaLogico m) {
		super(m);
		this.alto = 75;
		this.ancho = 75;
		this.velocidad = 5; //En la que recorre el mapa;
	}

	public int getFuerza() {
		return this.fuerza;
	}
	
	public abstract void mover();

	
}
