package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Sonido;
import Main.Visitantes.VisitanteDisparoA_Enemigo;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public class DisparoAliado extends Disparo{
	//Fuerza de disparo;
	
	protected DisparoAliadoGrafico disparoAliadoGrafico;
	
	public DisparoAliado(int x, int y, int fuerza, MapaLogico m) {
		super(m);
		this.fuerza = fuerza;
		this.x = x;
		this.y = y;
	
		this.visitante = new VisitanteDisparoA_Enemigo(this);

		
		disparoAliadoGrafico = new DisparoAliadoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = disparoAliadoGrafico;
	}

	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	//Va a mover el disparo, y si se encuentra con un ememido lo golpea y se autodestruye.
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneDerecha(x + velocidad, y, ancho);
		
		for(Entidad e: listaColisionados) {
			
			//Hace daño al primer enemigo y muere.
			e.visitar(visitante);
			
			///////   PRUEBA   ////////////////////////////////////////////////////////////////////////////////////////////////////
			//Debe ir en cada disparo concreto
			Sonido.play(Sonido.DISPARO_FEMUR1);
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		}
		
		this.mover();
	}
	
	public void mover() {
		this.setX(x + velocidad);
	}

	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

	public void recibirGolpe(int d) {
	}

}
