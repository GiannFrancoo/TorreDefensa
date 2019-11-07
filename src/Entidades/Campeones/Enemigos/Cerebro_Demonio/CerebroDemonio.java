package Entidades.Campeones.Enemigos.Cerebro_Demonio;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class CerebroDemonio extends Enemigo{

	public CerebroDemonio(MapaLogico m) {
		super(m);
				
		this.ancho = 57;
		this.alto = 80;
		this.velocidad = 1;
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.fuerza = 25;
		this.rango = 20;
		this.dps = 25;
		monedas = 50;
				
		CerebroDemonioGrafico cer = new CerebroDemonioGrafico(this.mapaLogico, this, ancho, alto);
		entidadGrafica = cer;
	}

	
	public void golpearRango() {	
	}

}
