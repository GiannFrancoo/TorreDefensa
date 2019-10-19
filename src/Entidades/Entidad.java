package Entidades;


import javax.swing.JLabel;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Utilidad.Lista.*;

public abstract class Entidad {
	
	//Atributos logica;
	protected int vida;

	protected boolean estaVivo = true;
	protected int ancho;
	protected int alto;
	protected int x;
	protected int y;
	protected EntidadGrafica entidadGrafica;
	protected MapaLogico mapaLogico;
	protected Position<Entidad> posEnLista;
	
	public Entidad(MapaLogico m) {
		mapaLogico = m;
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
	
	public Position<Entidad> getPosEnLista(){
		return posEnLista;
	}
	
	public void setPosEnLista(Position<Entidad> pos) {
		posEnLista = pos;
	}
	
	public  void recibirGolpe(int d) {
		vida = vida - d;
		if(vida <= 0) {
			this.estaVivo = false;
			mapaLogico.eliminar(this.getPosEnLista());
		}
	}
	
	public abstract void accionar(); // Accionar de cada entidad
	
	public abstract void visitar(Visitante a); // Colisiones
	
}

