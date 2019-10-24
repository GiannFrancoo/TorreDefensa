package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteDisparoA_Aliado;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	
	public DisparoEnemigo(int x, int y, int fuerza, int rango, MapaLogico mapaLogico) {
		super(mapaLogico);
		this.fuerza = fuerza;
		this.rango = rango;
		this.x = x;
		this.y = y;
		
		this.visitante = new VisitanteDisparoA_Aliado(this);
		
	}

	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	//Va a mover el disparo, y si se encuentra con un ememido lo golpea y se autodestruye.
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x + this.getAncho()/2, y);

		for(Entidad e: listaColisionados) {
			
			//Hace danio al primer enemigo y muere.
			e.visitar(visitante);
		}
		
		this.mover();
		
	}
	
	public void mover() {
		this.setX(x - velocidad);
		this.rango -= velocidad;
		if (rango <= 0) {
			this.eliminar();
		}
	}
	
	// Para las colisiones
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}


	public void recibirGolpe(int d) {
	}

}
