package Entidades;

import javax.swing.Icon;
import javax.swing.JLabel;

import Utilidad.Pair;

public abstract class Entidad {
	
	//Atributos logica;
	protected Pair<Integer,Integer> posicion;

	//Atributos grafica;
	protected JLabel grafica; // Estado actual de la imagen
	protected Icon imagenes[]; // Conjunto de imagenes;
	protected final int alto = 40; // Tamaño;
	protected final int ancho = 40; // Tamaño;
	
	public Entidad(int x, int y) {
		posicion = new Pair<Integer,Integer>(x,y);
		grafica = new JLabel();
		imagenes = new Icon[10]; //Preventivamente;
	}
	
	protected void setPos(Pair<Integer,Integer> pos){
			this.posicion = pos;
	}
	
	public Pair<Integer,Integer> getPos(){
		return posicion;
	}
		
	public JLabel getGrafica(){
		//System.out.println("Entidad:: Retorno la grafica");
		grafica.setBounds(posicion.getKey(), posicion.getValue(), alto, ancho);
		return grafica;
	}
	
}

