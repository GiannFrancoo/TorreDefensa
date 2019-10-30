package Entidades.Campeones.Enemigos.Cerebro;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Cerebro extends Enemigo{

	public Cerebro(MapaLogico m, Magia drop) {
		super(m);
		
		this.ancho = 57;
		this.alto = 80;
		this.velocidad = 2;
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.fuerza = 20;
		this.rango = 20;
		this.dps = 35;
		monedas = 30;
		
		this.drop = drop;
		
		CerebroGrafico cer = new CerebroGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = cer;
		
	}

	
	public void golpearRango() {
		
	}

}
