package Entidades.Campeones.Aliados.Mascara;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.EventosAleatorios.EAVida.DisparoEAVida;
import Main.MapaLogico;

public class Mascara extends Aliado{

	protected MascaraGrafico per;

	public Mascara(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 80; 
		this.alto = 160;
		this.fuerza = 20;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 10; // Cambiar.
		
		per = new MascaraGrafico(this.mapaLogico , this, this.ancho, this.alto);
		entidadGrafica = per; 
	}

	
	public void golpearRango() {
		this.dpsTiming = dps;
		DisparoMascara disparoMascara = new DisparoMascara(x, y, this.fuerza, this.rango, mapaLogico);
		DisparoMascara1 disparoMascara1 = new DisparoMascara1(x, y + 90, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(disparoMascara);
		mapaLogico.insertar(disparoMascara1);
	}

}
