package Entidades.Campeones.Aliados.Piedra;

import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;

public class Piedra extends Aliado {

	public Piedra(MapaLogico m) {
		super(m);
		
		this.ancho = 70;
		this.alto = 75;
		this.vidaMaxima = 200;
		this.vidaActual = vidaMaxima;
		this.fuerza = 0;	
		this.monedas = 10;
		
	
		PiedraGrafico p = new PiedraGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = p;
	}

	public void golpearRango() {}

}
