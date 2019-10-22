package Entidades.EventosAleatorios;

import Entidades.Entidad;
import Main.MapaLogico;
import Utilidad.Lista.*;

public abstract class EventoAleatorio extends Entidad {
	//fila 	  --> Entidad;
	//columna --> Entidad;
	protected int fuerza;
	protected Position<Entidad> posEnLista;
	
	public EventoAleatorio(MapaLogico m) {
		super(m);
	}
	
	public abstract int getFuerza();
	public abstract void setFuerza(int f);
}
