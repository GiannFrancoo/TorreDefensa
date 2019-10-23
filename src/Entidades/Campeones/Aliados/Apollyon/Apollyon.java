package Entidades.Campeones.Aliados.Apollyon;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Apollyon extends Aliado {
	
	public Apollyon(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		this.ancho = 75;
		this.alto = 75;
		this.vidaActual = 100;
		this.fuerza = 15;
		this.rango = 5;		
		monedas = 100;
		

		ApollyonGrafico apollyonGrafico= new ApollyonGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = apollyonGrafico;
	}

	@Override
	public void golpearRango() {
	}

}
