package Entidades.EventosAleatorios.EATiempo;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.EventosAleatorios.EAVida.EAVidaGrafico;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class EventoAleatorioTiempo extends Aliado{

	protected EATiempoGrafico EATG;
	
	public EventoAleatorioTiempo(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 10000; //Infinito.
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 80;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 0;
		
		EATG = new EATiempoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = EATG;
		
	}

	
	public void golpearRango() {
		
	}

	

}
