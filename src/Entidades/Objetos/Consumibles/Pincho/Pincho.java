package Entidades.Objetos.Consumibles.Pincho;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Consumibles.Consumible;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitantePincho;

public class Pincho extends Consumible {
	
	protected int tiempoDeVida;
	protected int tiempoActual;
	
	public Pincho(MapaLogico m) {
		super(m);
		
		this.ancho = 70;
		this.alto = 75;
		this.vidaMaxima = 200;
		this.vidaActual = vidaMaxima;
		
		this.tiempoDeVida = 50;
		this.tiempoActual = tiempoDeVida;
		this.fuerza = 100;	
		this.monedas = 10;
		
		this.visitante = new VisitantePincho(this);
		
	
		PinchoGrafico p = new PinchoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = p;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}

	public void accionar() {
		
		if(this.estaVivo) {		
			if(tiempoActual == 0) {
				
				for (Entidad e : mapaLogico.colisioneRango(this.getX(), this.getX() + this.getAncho(), this.getY(), this.getY()+this.getAlto())) {
					if(e.getVidaActual() > 0)
						e.visitar(visitante);
				}
			
				this.eliminar();
			}
			else {
				--tiempoActual;
			}	
		}
	}

	public void visitar(Visitante a) {
		if(this.estaVivo) {
			a.visita(this);
		}
	}
	
	public void golpearRango() {}
	
	public void recibirGolpe(int d) {}
}
