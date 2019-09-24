package Entidades.Objetos;

import Entidades.Entidad;
import Main.MapaLogico;

public abstract class Objeto extends Entidad{
	
	//fila    --> Entidad;
	//columna --> Entidad;
	
	public Objeto(int x, int y, MapaLogico m) {
		super(x, y, m);
	}
	

}
