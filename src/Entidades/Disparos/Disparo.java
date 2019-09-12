package Entidades.Disparos;

import Entidades.Entidad;

public abstract class Disparo extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	public Disparo(int x, int y) {
		super(x, y);
	}

	protected int fuerza;
	
	public int getFuerza() {
		return fuerza;
	}
}
