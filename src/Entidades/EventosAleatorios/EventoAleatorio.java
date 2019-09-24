package Entidades.EventosAleatorios;

import Entidades.Entidad;
import Main.MapaLogico;
import Utilidad.Lista.*;

public abstract class EventoAleatorio extends Entidad {
	//fila 	  --> Entidad;
	//columna --> Entidad;
	protected int fuerza;
	protected Position<Entidad> posEnLista;
	
	public EventoAleatorio(int x, int y, MapaLogico m) {
		super(x, y, m);
	}
	
	
	public abstract Position<Entidad> getPosEnLista(); 
	public abstract void setPosEnLista(Position<Entidad> pos);
	public abstract int getFuerza();
	public abstract void setFuerza(int f);
}
