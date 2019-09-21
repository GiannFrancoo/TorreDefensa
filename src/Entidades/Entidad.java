package Entidades;


import Entidades.Disparos.Disparo;
import Utilidad.Pair;

public abstract class Entidad {
	
	//Atributos logica;
	protected Pair<Integer,Integer> posicion;
	protected EntidadGrafica entidadGrafica;
	
	public Entidad(int x, int y) {
		posicion = new Pair<Integer,Integer>(x,y);
	}
	
	public void setPos(Pair<Integer,Integer> pos){
			this.posicion = pos;
	}
	
	public Pair<Integer,Integer> getPos(){
		return posicion;
	}
		
	public EntidadGrafica getGrafica(){
		return entidadGrafica;
	}

	public abstract void mover();
	
}

