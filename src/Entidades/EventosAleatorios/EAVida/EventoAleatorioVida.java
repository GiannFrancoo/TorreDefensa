package Entidades.EventosAleatorios.EAVida;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Main.MapaLogico;
import Main.Visitantes.Visitante;


public class EventoAleatorioVida extends Aliado {

	protected EAVidaGrafico EAVGrafico;//EA (Electronic Arts).
	
	public EventoAleatorioVida(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 150;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 80;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 0;
		
		EAVGrafico = new EAVidaGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = EAVGrafico;
	}

	
	public void golpearRango() {
		this.dpsTiming = dps;
		DisparoEAVida disparoEAV = new DisparoEAVida(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(disparoEAV);
		disparoEAV.setX(this.x);
		disparoEAV.setY(this.y);
	}

	
	
	
	
	
}
