package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteDisparoA_Enemigo;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public abstract class DisparoAliado extends Disparo{
	
	public DisparoAliado(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(m);
		this.fuerza = fuerza;
		this.rango = rango;
		this.x = x;
		this.y = y;		
		this.visitante = new VisitanteDisparoA_Enemigo(this);

		//Cada disparo concreto debe asignar su sonido
		//this.sonido = Sonido.DISPARO_FEMUR1;
		
		//DisparoAliadoGrafico disparoAliadoGrafico = new DisparoAliadoGrafico(mapaLogico, this, ancho, alto);
		//entidadGrafica = disparoAliadoGrafico;
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	public void intentarMoverse() {
//		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x + velocidad + ancho, y);
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x + ancho/2, y);

		
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
