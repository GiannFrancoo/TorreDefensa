package Entidades.Disparos;

import java.applet.AudioClip;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public abstract class Disparo extends Entidad{
	
	protected int fuerza;
	protected int rango;
	protected int velocidad;
	
	//Cada disparo concreto debe asignar su sonido
	protected AudioClip sonido;

	public Disparo(MapaLogico m) {
		super(m);
		this.alto = 75;
		this.ancho = 75;
		this.velocidad = 10; //En la que recorre el mapa;
	}
	
	public AudioClip getSonido() {
		return this.sonido;
	}

	public int getFuerza() {
		return this.fuerza;
	}
	
	public abstract void mover();

	
}
