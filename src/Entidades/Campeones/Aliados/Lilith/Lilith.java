package Entidades.Campeones.Aliados.Lilith;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Lilith extends Aliado{
	
	public Lilith(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 30;	
		this.rango = 20;
		this.dps = 35;
		monedas = 100;

		LilithGrafico lilithGrafico = new LilithGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lilithGrafico;
	}

	public void golpearRango() {		
	}

}
