package Entidades.Disparos;

import javax.swing.JLabel;

import Entidades.Entidad;
import Main.MapaLogico;

public abstract class Disparo extends Entidad{
	
	protected int fuerza;
	protected int velocidad;;
	protected MapaLogico mapaLogico;

	public Disparo(MapaLogico m) {
		super(m);
		velocidad = 1; //En la que recorre el mapa;
	}

	public int getFuerza() {
		return fuerza;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	
}
