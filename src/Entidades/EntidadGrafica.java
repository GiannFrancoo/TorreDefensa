package Entidades;

import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected Icon imagenes[]; // Conjunto de imagenes;
	protected final int alto = 40; // Tamaño;
	protected final int ancho = 40; // Tamaño;
	
	protected Entidad entidad;
	
	public EntidadGrafica(Entidad e) {
		grafica = new JLabel();
		imagenes = new Icon[10];
		entidad = e;
	}
	
	public JLabel getGrafica(){
		grafica.setBounds(entidad.getPos().getKey(), entidad.getPos().getValue(), alto, ancho);
		return grafica;
	}
	
	/*
	public void cambiarGrafica(int i) {
		grafica.setIcon(imagenes[i]);
	}
	*/

}
