package Entidades.EventosAleatorios.EATiempo;

import Entidades.Entidad;
import Main.Cronometro;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteEATiempo;

public class EATiempo extends Entidad{

	protected EATiempoGrafico EATG;	
	protected int dps = 45;
	protected int dpsTiming = dps;
	protected int rango = 0;
	protected int ancho = 57;
	protected int alto = 80;
	protected int fuerza = 45;
	protected Cronometro crono;

	
	public EATiempo(MapaLogico m) {
		super(m);
		
		EATG = new EATiempoGrafico(m, this, this.alto, this.ancho);
		this.entidadGrafica  = EATG;
		
		this.visitante = new VisitanteEATiempo(this);
		crono = new Cronometro(5000);
	}
	
	public void recibirGolpe(int d) {}

	
	public void accionar() {
		if (this.crono.isAlive()) {
			
			if (this.dpsTiming == 0) {
				for(Entidad e: mapaLogico.colisioneRango(this.getX(), this.getX() + this.getAncho(), this.getY(), this.getY() + this.getAlto())) {
					if(e.getVidaActual() > 0) { //si la entidad esta viva lo visito.
						e.visitar(this.visitante);
					}
				}
				
				//this.entidadGrafica.golpearMelee();
				this.dpsTiming = dps;
				
			} else {
				this.dpsTiming--;
			}
		}
		else {
			this.crono.stop(); //Elimino el crono.
			//this.eliminar(); --> No podemos poner el eliminar aca, porque es instaneo o_O
		}
	}
		
	public void visitar(Visitante a) {
		a.visita(this);
	}
	
	public int getFuerza() {
		return this.getFuerza();
	}
	
	
	
	
	
}
