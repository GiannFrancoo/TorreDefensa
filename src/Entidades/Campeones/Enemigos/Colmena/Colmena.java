package Entidades.Campeones.Enemigos.Colmena;

import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Colmena extends Enemigo {
	
	public Colmena(MapaLogico mapaLogico) {
		super(mapaLogico);
		
		this.ancho = 65; //34 por regla de 3 (39 -> 75)
		this.alto = 75;  //39                (34 ->  X)
		this.velocidad = 1;
		this.vidaMaxima = 100;
		this.vidaActual = 100;
		this.fuerza = 100;
		this.rango = 20;
		this.dps = 35;
		monedas = 30;
		
		ColmenaGrafico c = new ColmenaGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = c;
	}

	public void agregarMagia(Magia m) {
		this.magias.addLast(m);
	}

	public void golpearRango() {
	}


}
