package Entidades.Campeones.Enemigos.Casper;

import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;

public class Casper extends Enemigo{

	public Casper(MapaLogico m) {
		super(m);
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.fuerza = 100;
		this.rango = 20;
		this.dps = 35;
		monedas = 30;
		
		CasperGrafico cas = new CasperGrafico(this.mapaLogico, this, alto, ancho);
		entidadGrafica = cas;
	}
	
	public void golpearRango() {
		
	}

}
