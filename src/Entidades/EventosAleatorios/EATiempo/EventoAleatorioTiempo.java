package Entidades.EventosAleatorios.EATiempo;

import Entidades.Entidad;
import Main.Cronometro;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteEATiempo;

public class EventoAleatorioTiempo extends Entidad{

	protected EATiempoGrafico EATG;	
	protected int dps = 45;
	protected int dpsTiming = dps;
	protected int rango = 0;
	protected int ancho = 57;
	protected int alto = 80;
	protected int fuerza = 45;
	protected Cronometro crono;

	
	public EventoAleatorioTiempo(MapaLogico m) {
		super(m);
		
		EATG = new EATiempoGrafico(m, this, this.alto, this.ancho);
		this.entidadGrafica  = EATG;
		
		this.visitante = new VisitanteEATiempo(this);
//		crono = new Cronometro(5000);
//		
		crono = new Cronometro(5000);
	}
	
	public void recibirGolpe(int d) {
		//Aqui no se hace nada.
	}

	
	public void accionar() {
		if (this.crono.isAlive()) {
			
			if (this.dpsTiming == 0) {
			//Aca se llamaria a el rango	
			//entidad.visitar(visitante).
				this.entidadGrafica.golpearMelee();
				
			} else {
				this.dpsTiming--;
			}
		}else {
			this.eliminar(); //Elimino el crono.
		}
	}
		
	public void visitar(Visitante a) {
		a.visita(this);
	}
	
	public int getFuerza() {
		return this.getFuerza();
	}
	
}
