package Entidades.Campeones.Aliados.Poop;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Poop extends Aliado{
	
	public Poop(MapaLogico mapaLogico) {
		super(mapaLogico);
	
		this.ancho = 70;
		this.alto = 75;
		this.vidaMaxima = 150;
		this.vidaActual = vidaMaxima;
		this.fuerza = 0;	
		monedas = 100;
		
	
		PoopGrafico p = new PoopGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = p;
	}

	public void golpearRango() {}

}
