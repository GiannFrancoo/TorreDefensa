package Entidades;


import javax.swing.JLabel;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Lista.*;

public abstract class Entidad {
	
	//Atributos logica;
	protected int ancho;
	protected int alto;
	protected int x;
	protected int y;
	protected EntidadGrafica entidadGrafica;
	protected MapaLogico mapaLogico;
	
	public Entidad(MapaLogico m) {
		mapaLogico = m;
	}
	
	public void setPos(int x, int y){
			this.x = x;
			this.y = y;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
		entidadGrafica.getLabel().setLocation(x, y);
	}
	
	public void setY(int y) {
		this.y = y;
		entidadGrafica.getLabel().setLocation(x, y);

	}
		
	public JLabel getGrafica(){
		return entidadGrafica.getLabel();
	}

	public abstract Position<Entidad> getPosEnLista();
	public abstract void setPosEnLista(Position<Entidad> pos);
	public abstract void mover();
	public abstract void visitado(VisitanteDisparo v);
}

