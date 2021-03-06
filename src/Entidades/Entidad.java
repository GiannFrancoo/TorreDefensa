package Entidades;


import javax.swing.JLabel;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Utilidad.Lista.*;

public abstract class Entidad {
	
	//Atributos logica;
	protected boolean estaVivo = true;
	protected int ancho;
	protected int alto;
	protected int x;
	protected int y;
	protected int vidaMaxima;
	protected int vidaActual;
	protected EntidadGrafica entidadGrafica;
	protected MapaLogico mapaLogico;
	protected Position<Entidad> posEnLista;
	public int monedas;
	
	protected Visitante visitante;
	
	public Entidad(MapaLogico m) {
		mapaLogico = m;
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return this.entidadGrafica;
	}
	
	public int getMonedas() {
		return monedas;
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
	
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	
	public int getVidaActual() {
		return vidaActual;
	}
	
	public void setVidaActual(int vida) {
		vidaActual = vida;
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
	
	public void setVivo(boolean v) {
		this.estaVivo = v;
	}
	
	public void eliminar() {
		this.estaVivo = false;
		this.mapaLogico.eliminar(this.getPosEnLista());
	}
	
	public abstract void recibirGolpe(int d);
	
	public abstract void accionar(); // Accionar de cada entidad
	
	public abstract void visitar(Visitante a); // Colisiones
	
}

