package Entidades.EventosAleatorios.EATiempo;

import Entidades.Entidad;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteEATiempo;
import Utilidad.Lista.PositionList;

public class EventoAleatorioTiempo extends Entidad{

	protected EATiempoGrafico EATG;
	protected Visitante visitanteAlcance;
	protected int dpsTiming;
	protected int rango;
	
	public EventoAleatorioTiempo(MapaLogico m) {
		super(m);
		this.visitanteAlcance = new VisitanteEATiempo(this);
		
	}
	
	public void recibirGolpe(int d) {
		//Aqui no se hace nada.
	}

	
	public void accionar() {
		this.intentarGolpear();
	}
	
	public void intentarGolpear() {
		if (this.dpsTiming == 0) {
			PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(x, x + this.rango + this.getAncho(), y);
			for (Entidad e : listaColisionados) {
				if (this.dpsTiming == 0) {
					e.visitar(visitanteAlcance);
				} 
				else {
					break;
				}
			}
		}
		else {
			--this.dpsTiming;
		}
	}
	
	
	public void visitar(Visitante a) {
		a.visita(this);
	}
	
	public int getFuerza() {
		return this.getFuerza();
	}
	
	
	
//	public EventoAleatorioTiempo(MapaLogico m) {
//		super(m);
//		
//		this.vidaMaxima = 10000; //Infinito.
//		this.vidaActual = this.vidaMaxima;
//		this.ancho = 67; 
//		this.alto = 80;
//		this.fuerza = 80;
//		this.rango = 550;		
//		this.dps = 45;
//		this.monedas = 0;
//		
//		EATG = new EATiempoGrafico(mapaLogico, this, ancho, alto);
//		entidadGrafica = EATG;
//		
//	}
//
//	
//	public void golpearRango() {
//		
//	}
//	public  EventoAleatorioTiempo() {
//		
//		int monedas = 0;
//		int dps = 45;
//		int fuerza = 80;
//		int ancho = 67; 
//	    int alto = 80;
//	    
//	    EATG = new EATiempoGrafico(mapaLogico l, this, ancho, alto);
//		entidadGrafica = EATG;
//		
//	}
	

}
