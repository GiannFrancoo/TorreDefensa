package Entidades.Campeones.Aliados.Persj2Casillas;

import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;

public class Pers2Casillas extends Aliado{

	protected Persj2CasillasGrafico per;

	public Pers2Casillas(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 20;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 150;
		
		per = new Persj2CasillasGrafico(this.mapaLogico , this, this.ancho, this.alto);
		entidadGrafica = per; 
	}

	
	public void golpearRango() {
		
	}

}
