package Entidades;

import javax.swing.Icon;
import javax.swing.JLabel;

import Utilidad.Pair;

public abstract class EntidadGrafica {
	
	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected Icon imagenes[]; // Conjunto de imagenes;
	protected int xGrafica;
	protected int yGrafica;
	
	protected Entidad entidad;
	
	public EntidadGrafica(Entidad e) {
		grafica = new JLabel();
		imagenes = new Icon[10];
		entidad = e;
	}
	
	public JLabel getGrafica(){
		return grafica;
	}
	
	public void setPos(Pair<Integer,Integer> pos) {
		this.convertirCoordenadas(pos);
		grafica.setLocation(xGrafica, yGrafica);
	}
	
	public void convertirCoordenadas(Pair<Integer,Integer> pos) {
		xGrafica = ((pos.getKey() + 233) * 10) / 841;
		yGrafica = ((pos.getValue() + 42) * 6) / 487;
	}
	
	/*
	public void cambiarGrafica(int i) {
		grafica.setIcon(imagenes[i]);
	}
	*/

}
