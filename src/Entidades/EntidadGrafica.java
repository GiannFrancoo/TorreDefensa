package Entidades;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected ImageIcon imagenes[]; // Conjunto de imagenes;
	
	public EntidadGrafica() {
		grafica = new JLabel();
		imagenes = new ImageIcon[10];
	}
	
	public JLabel getLabel(){
		return grafica;
	}
	
	
	
	/*
		xGrafica = ((pos.getKey() + 233) * 10) / 841;
		yGrafica = ((pos.getValue() + 42) * 6) / 487;
	
		public void cambiarGrafica(int i) {
			grafica.setIcon(imagenes[i]);
		}
	*/

}
