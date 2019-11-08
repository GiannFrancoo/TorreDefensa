package Entidades.EventosAleatorios.EAVida1;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;


public class EAVida1 extends Entidad{
	
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
	
	public EAVida1(MapaLogico m) {
		super(m);
		
	}
	
	public void golpearRango(){
	}

	public void recibirGolpe(int d) {
		this.setVidaActual(this.vidaActual -= d);
		if(this.vidaActual <= 0) { //esta morido.
			this.eliminar();
		}
		this.entidadGrafica.recibirGolpe();
	}

	public void accionar() {
	}

	public void visitar(Visitante a) {
		a.visita(this);
	}

	
	
	
	
	
}
