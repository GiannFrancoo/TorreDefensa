package Entidades.Campeones.Aliados.Apollyon;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Aliados.Azazel.DisparoAzazel;
import Main.MapaLogico;

public class Apollyon extends Aliado {
	
	public Apollyon(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 75;
		this.alto = 75;				
		this.fuerza = 40;
		this.rango = 300;		
		this.dps = 45;
		monedas = 75;
		

		ApollyonGrafico apollyonGrafico= new ApollyonGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = apollyonGrafico;
	}

	@Override
	public void golpearRango() {
		this.dpsTiming = dps;
		//DisparoLazaro d = new DisparoLazaro(x, y, this.fuerza, this.rango, mapaLogico);
		DisparoAzazel d = new DisparoAzazel(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
	}

}
