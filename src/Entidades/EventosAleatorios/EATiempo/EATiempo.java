package Entidades.EventosAleatorios.EATiempo;

import Entidades.Entidad;
import Main.Cronometro;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteEATiempo;

public class EATiempo extends Entidad{

	protected int dps = 5;
	protected int dpsTiming = dps;
	protected int fuerza = 500;
	protected Cronometro crono;

	
	public EATiempo(MapaLogico m) {
		super(m);
		
		this.ancho = 80;
		this.alto = 80;
		
		EATiempoGrafico EATG = new EATiempoGrafico(m, this, this.alto, this.ancho);
		this.entidadGrafica  = EATG;
		
		this.visitante = new VisitanteEATiempo(this);
		crono = new Cronometro(10000);
		crono.start();
	}
	
	public void recibirGolpe(int d) {}

	
	public void accionar() {
		if(this.estaVivo) {
			
			if (this.crono.isAlive()) {				
				
				if (this.dpsTiming == 0) {
					
					for(Entidad e: mapaLogico.colisioneRango(x, x + this.getAncho(), y-1, y + this.getAlto() + 10)) {
						e.visitar(this.visitante);
					}
					
					//this.entidadGrafica.golpearMelee();
					this.dpsTiming = dps;
					
				} else {
					this.dpsTiming--;
				}
			} else {
				this.eliminar();
			}
			
		}
	}
		
	public void visitar(Visitante a) {
		if(this.estaVivo) {
			a.visita(this);
		}
	}
	
	public int getFuerza() {
		return this.fuerza;
	}
	
	
	
	
	
}
