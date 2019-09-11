package Entidades.EventosAleatorios;

import Entidades.Entidad;

public abstract class EventoAleatorio extends Entidad {
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	protected int fuerza;
	
	public abstract int getFuerza();
	public abstract void setFuerza(int f);
}
