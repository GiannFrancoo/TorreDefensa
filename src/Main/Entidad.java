package Main;
import javax.swing.Icon;
import javax.swing.JLabel;

import Utilidad.Pair;

public abstract class Entidad {
	
	//Atributos logica;
	protected int fila;
	protected int columna;
	
	//Atributos grafica;
	protected JLabel grafica;
	protected Icon imagenes[];
	protected int alto;
	protected int ancho;
	
	
	public void setPos(Pair<Integer,Integer> pos){
			this.fila = pos.getKey();
			this.columna = pos.getValue();
	}
	
	public Pair<Integer,Integer> getPos(){
		return new Pair<Integer,Integer>(fila,columna);
	}
	
	
	public JLabel getGrafica(){
		return grafica;
	}
}

