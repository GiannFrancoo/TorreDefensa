package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Sonido;
import Main.Visitantes.VisitanteDisparoA_Enemigo;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public class DisparoAliado extends Disparo{
	
	public DisparoAliado(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(m);
		this.fuerza = fuerza;
		this.rango = rango;
		this.x = x;
		this.y = y;
	
		//Cada disparo concreto debe asignar su sonido
		this.sonido = Sonido.DISPARO_FEMUR1;
		
		
		this.visitante = new VisitanteDisparoA_Enemigo(this);

		
		DisparoAliadoGrafico disparoAliadoGrafico = new DisparoAliadoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = disparoAliadoGrafico;
	}
	
	

	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	public void intentarMoverse() {
//		PositionList<Entidad> listaColisionados = mapaLogico.colisioneDerecha(x + velocidad, y, ancho);
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x + velocidad + ancho, y);
		
		for(Entidad e: listaColisionados) {
			
			//Hace danio al primer enemigo y muere.
			e.visitar(visitante);
		}
		
		this.mover();
	}
	
	public void mover() {
		this.setX(x + velocidad);
		this.rango -= velocidad;
		if (rango <= 0) {
			entidadGrafica.eliminar();
			this.eliminar();
		}
	}

	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

	public void recibirGolpe(int d) {
	}

}
