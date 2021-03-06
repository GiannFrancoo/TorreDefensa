package Entidades.Campeones.Enemigos.Casper;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Casper extends Enemigo{

	public Casper(MapaLogico m) {
		super(m);
				
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.fuerza = 10;
		this.rango = 650;
		this.dps = 70;
		monedas = 30;
		
		CasperGrafico cas = new CasperGrafico(this.mapaLogico, this, alto, ancho);
		entidadGrafica = cas;
	}
	
	public void golpearRango() {
		this.dpsTiming = dps;
		DisparoCasper d = new DisparoCasper(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
		
	}

}
