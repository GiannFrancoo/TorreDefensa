package Entidades.Objetos.Consumibles.Pincho;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Consumibles.Consumible;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class Pincho extends Consumible {
	
	public Pincho(MapaLogico m) {
		super(m);
		
		this.ancho = 70;
		this.alto = 75;
		this.vidaMaxima = 200;
		this.vidaActual = vidaMaxima;
		this.fuerza = 100;	
		this.monedas = 10;
		
	
		PinchoGrafico p = new PinchoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = p;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}

	public void golpearRango() {}

	public void recibirGolpe(int d) {}

	public void accionar() {
		
		if(this.estaVivo) {
			
			
		}
		
		
	}

	public void visitar(Visitante a) {}
}
