package Entidades;


import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Pair;
import Utilidad.Lista.*;

public abstract class Entidad {
	
	//Atributos logica;
	protected Pair<Integer,Integer> posicion;
	protected EntidadGrafica entidadGrafica;
	protected MapaLogico mapaLogico;
	
	public Entidad(int x, int y, MapaLogico m) {
		posicion = new Pair<Integer,Integer>(x,y);
		mapaLogico = m;
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

	public abstract Position<Entidad> getPosEnLista();
	public abstract void setPosEnLista(Position<Entidad> pos);
	public abstract void mover();
	public abstract void visitado(VisitanteDisparo v);
}

