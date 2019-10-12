package Entidades.Disparos;

import javax.swing.JLabel;

import Main.MapaLogico;

public abstract class Disparo{
	
	protected int fuerza;
	protected int velocidad;
	protected int x;
	protected int y;
	protected int ancho;
	protected int alto;
	protected JLabel grafica;
	protected MapaLogico mapaLogico;

	public Disparo(MapaLogico m) {
		mapaLogico = m;
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
