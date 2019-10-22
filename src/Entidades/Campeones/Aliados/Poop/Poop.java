package Entidades.Campeones.Aliados.Poop;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Poop extends Aliado{
	
	public Poop(MapaLogico mapaLogico) {
		super(mapaLogico);
	
		this.ancho = 63;
		this.alto = 75;
		this.vidaActual = 100;
		this.fuerza = 15;	
		monedas = 100;
		
	
		PoopGrafico p = new PoopGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = p;
	}

	@Override
	public void golpearRango() {
	}

	@Override
	public void agregarMagia(Magia m) {
	}

}
