package Entidades.EventosAleatorios.EAVida;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;


public class EAVida extends Entidad{
	
	//EA (Electronic Arts).
	protected int fuerza;
	protected int rango;
	protected int dps = 45;
	protected int dpsTiming = dps;
	
	public EAVida(MapaLogico m) {
		super(m);
		
		this.vidaMaxima = 150;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 80;
		this.rango = 550;
		this.monedas = 0;
		this.dps = 45;
		this.dpsTiming = dps;
		
		
		EAVidaGrafico EAVGrafico = new EAVidaGrafico(m, this, this.alto, this.ancho);
		this.entidadGrafica  = EAVGrafico;
		
	}
	
	public void golpearRango(){
	}

	public void recibirGolpe(int d) {
		this.vidaActual -= d;
		this.setVidaActual(this.vidaActual);
		if(this.vidaActual <= 0) { //esta morido.
			this.eliminar();
		}
		this.entidadGrafica.recibirGolpe();
	}

	public void accionar() {}

	public void visitar(Visitante a) {
		if(this.estaVivo) {
			a.visita(this);
		}
	}

	
	
	
	
	
}
