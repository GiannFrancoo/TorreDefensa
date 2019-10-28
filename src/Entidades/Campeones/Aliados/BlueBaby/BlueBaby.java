package Entidades.Campeones.Aliados.BlueBaby;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Aliados.Lazaro.DisparoLazaro;
import Main.MapaLogico;

public class BlueBaby extends Aliado{

	public BlueBaby(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 35;
		this.rango = 550;		
		this.dps = 35;
		monedas = 100;
		
		BlueBabyGrafico b = new BlueBabyGrafico(this.mapaLogico, this, this.alto, this.ancho);
		entidadGrafica = b;
	}

	public void golpearRango() {
		this.dpsTiming = dps;
		DisparoLazaro d = new DisparoLazaro(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
		//BlueBabyGrafico.golpear();
	}

}
