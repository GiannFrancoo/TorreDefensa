package Entidades.Campeones.Aliados.Lilith;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Lilith extends Aliado{

	protected LilithGrafico lilithGrafico;
	
	public Lilith(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.ancho = 67; 
		this.alto = 80;
		this.vidaActual = 100;
		this.fuerza = 50;	
		this.rango = 15;
		this.dps = 35;
		monedas = 100;

		LilithGrafico lilithGrafico= new LilithGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lilithGrafico;
	}
	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}

	public void golpearRango() {		
	}

}
