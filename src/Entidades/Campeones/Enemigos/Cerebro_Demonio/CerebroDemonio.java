package Entidades.Campeones.Enemigos.Cerebro_Demonio;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class CerebroDemonio extends Enemigo{

	public CerebroDemonio(MapaLogico m, Magia drop) {
		super(m);
		
		this.drop = drop;
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.fuerza = 100;
		this.rango = 20;
		this.dps = 35;
		monedas = 30;
		
		
		CerebroDemonioGrafico cer = new CerebroDemonioGrafico(this.mapaLogico, this, ancho, alto);
		entidadGrafica = cer;
	}

	
	public void golpearRango() {	
	}

}
