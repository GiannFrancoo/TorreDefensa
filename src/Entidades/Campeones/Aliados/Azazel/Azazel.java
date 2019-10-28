package Entidades.Campeones.Aliados.Azazel;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Aliados.Lazaro.DisparoLazaro;
import Main.MapaLogico;

public class Azazel extends Aliado{
	
	public Azazel(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 90; 
		this.alto = 80;
		this.fuerza = 40;
		this.rango = 650;		
		this.dps = 45;
		this.monedas = 120;
		
		AzazelGrafico azazelGrafico = new AzazelGrafico(this.mapaLogico, this, alto, ancho);
		entidadGrafica = azazelGrafico;
		
	}

	public void golpearRango() {
		this.dpsTiming = dps;
		//DisparoLazaro d = new DisparoLazaro(x, y, this.fuerza, this.rango, mapaLogico);
		DisparoAzazel d = new DisparoAzazel(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
	}

}
