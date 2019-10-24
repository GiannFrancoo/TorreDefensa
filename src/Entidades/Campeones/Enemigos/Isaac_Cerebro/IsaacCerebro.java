package Entidades.Campeones.Enemigos.Isaac_Cerebro;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class IsaacCerebro extends Enemigo{

	public IsaacCerebro(MapaLogico m, Magia drop) {
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
		
		IsaacCerebroGrafico c = new IsaacCerebroGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = c;
	}

	@Override
	public void golpearRango() {
		// TODO Auto-generated method stub
		
	}

}
