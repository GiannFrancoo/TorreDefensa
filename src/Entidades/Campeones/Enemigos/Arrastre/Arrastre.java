package Entidades.Campeones.Enemigos.Arrastre;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Campeones.Enemigos.Casper.DisparoCasper;
import Main.MapaLogico;

public class Arrastre extends Enemigo{

	public Arrastre(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.fuerza = 10;
		this.rango = 650;
		this.dps = 70;
		monedas = 25;
		
		ArrastreGrafico ng = new ArrastreGrafico(m, this, this.ancho, this.alto);
		entidadGrafica = ng;	
	}

	public void golpearRango() {
	}

}
