package Entidades.EventosAleatorios.EAVida;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;


public class EAVida extends Entidad{
	
	protected EAVidaGrafico EAVGrafico;//EA (Electronic Arts).
	int vidaMaxima = 150;
	int vidaActual = this.vidaMaxima;
	int ancho = 67; 
	int alto = 80;
	int fuerza = 80;
	int rango = 550;
	int monedas = 0;
	int dps = 45;
	int dpsTiming = dps;
	
	public EAVida(MapaLogico m) {
		super(m);
		
		EAVGrafico = new EAVidaGrafico(m, this, this.alto, this.ancho);
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
		a.visita(this);
	}

	
	
	
	
	
}
