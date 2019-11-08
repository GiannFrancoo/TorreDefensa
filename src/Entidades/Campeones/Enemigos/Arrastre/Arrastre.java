package Entidades.Campeones.Enemigos.Arrastre;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Campeones.Enemigos.Casper.DisparoCasper;
import Main.MapaLogico;

public class Arrastre extends Enemigo{

	public Arrastre(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 70;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 3;
		this.fuerza = 30;
		this.rango = 20;
		this.dps = 20;
		monedas = 25;
		
		ArrastreGrafico ng = new ArrastreGrafico(m, this, this.ancho, this.alto);
		entidadGrafica = ng;	
	}

	public void golpearRango() {
	}

}
