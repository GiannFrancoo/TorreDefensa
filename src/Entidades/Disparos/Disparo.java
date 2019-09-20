package Entidades.Disparos;

import Entidades.Entidad;

public abstract class Disparo extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	protected int fuerza;

	public Disparo(int x, int y) {
		super(x, y);
	}

	public int getFuerza() {
		return fuerza;
	}
}
