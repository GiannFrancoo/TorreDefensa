package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.Visitante;
import Utilidad.Lista.PositionList;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	
	public DisparoEnemigo(int x, int y, int fuerza, MapaLogico mapaLogico){
		super(mapaLogico);
		this.fuerza = fuerza;
		this.x = x;
		this.y = y;
		
		disparoEnemigoGrafico = new DisparoEnemigoGrafico(mapaLogico, this);
		entidadGrafica = disparoEnemigoGrafico;
	}

	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		Visitante visitanteAliado = new VisitanteB_Aliado();
		boolean lePegue = false;
		
		// Barricadas
		for(Entidad e: listaColisionados) {
			lePegue = e.visitar(visitanteAliado); // Ve si esa entidad es una Aliado
			
			if (lePegue) { // Le pega sea aliado o barricada y despues corta
				Aliado a = (Aliado) e;
				a.recibirGolpe(fuerza);
				break;
			}	
		}
		
		if(!lePegue) { // Si se puede mover...
			this.mover();
		}
		else {
			this.estaVivo = false;
			mapaLogico.eliminar(this.getPosEnLista());
		}
	}
	
	public void mover() {
		this.setX(x - velocidad);
	}
	
	// Para las colisiones
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

}
