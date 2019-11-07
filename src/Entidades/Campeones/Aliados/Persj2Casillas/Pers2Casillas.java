package Entidades.Campeones.Aliados.Persj2Casillas;

import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;

public class Pers2Casillas extends Aliado{

	protected Persj2CasillasGrafico per;

	public Pers2Casillas(MapaLogico m) {
		super(m);
		
		this.ancho = 85; 
		this.alto = 160;
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.fuerza = 20;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 200;
		
		per = new Persj2CasillasGrafico(this.mapaLogico , this, this.ancho, this.alto);
		entidadGrafica = per; 
	}

	
	public void golpearRango() {
		
	}

}
