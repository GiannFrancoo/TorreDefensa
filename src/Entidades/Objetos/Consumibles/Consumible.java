package Entidades.Objetos.Consumibles;

import Entidades.Objetos.Objeto;

public abstract class Consumible extends Objeto{
	
	//fila	  --> Entidad;
	//columna --> Entidad;

	protected int fuerza;
	
	public Consumible(int x, int y) {
		super(x,y);
	}

	

}
