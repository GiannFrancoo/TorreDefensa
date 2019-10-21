package Entidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Main.MapaLogico;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected ImageIcon imagenes[]; // Conjunto de imagenes;
	protected MapaLogico mapaLogico;
	
	public EntidadGrafica(MapaLogico mapaLogico) {
		grafica = new JLabel();
		imagenes = new ImageIcon[10];
		this.mapaLogico = mapaLogico;
	}
	
	public JLabel getLabel(){
		return grafica;
	}
	
	public abstract void golpearMelee();
	public abstract void golpearRango();
	public abstract void eliminar();
	
	
	/*
		xGrafica = ((pos.getKey() + 233) * 10) / 841;
		yGrafica = ((pos.getValue() + 42) * 6) / 487;
	
		public void cambiarGrafica(int i) {
			grafica.setIcon(imagenes[i]);
		}
	*/

}
