package Entidades.Objetos.Consumibles;

import Entidades.Objetos.Objeto;
import Main.MapaLogico;

public abstract class Consumible extends Objeto{
	
	//fila	  --> Entidad;
	//columna --> Entidad;

	protected int fuerza;
	
	public Consumible(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	

}
