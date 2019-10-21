package Entidades.Campeones.Aliados.Lilith;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Lilith extends Aliado{

	protected LilithGrafico lilithGrafico;
	
	public Lilith(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.ancho = 75;
		this.alto = 75;
		this.vidaActual = 100;
		this.fuerza = 15;	
		monedas = 100;
		

		LilithGrafico lilithGrafico= new LilithGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lilithGrafico;
	}
	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	// Recibe un golpe de un enemigo;
	public void recibirGolpe(int d) {
		vidaActual = vidaActual - d;
		lilithGrafico.recibirGolpe();
	}

	public void golpearRango() {		
	}

}
