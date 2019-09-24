package Entidades;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected Icon imagenes[]; // Conjunto de imagenes;
	protected int xGrafica;
	protected int yGrafica;
	
	protected Entidad entidad;
	
	public EntidadGrafica(Entidad e, int x, int y) {
		grafica = new JLabel();
		imagenes = new Icon[10];
		entidad = e;
		xGrafica = ((x + 233) * 10) / 841;
		yGrafica = ((y + 42) * 6) / 487;
	}
	
	public JLabel getGrafica(){
		return grafica;
	}
	
	/*
	public void cambiarGrafica(int i) {
		grafica.setIcon(imagenes[i]);
	}
	*/

}
