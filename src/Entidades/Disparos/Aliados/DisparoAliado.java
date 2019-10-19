package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Sonido;
import Main.Visitantes.VisitanteB_Enemigo;
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
	
		disparoAliadoGrafico = new DisparoAliadoGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = disparoAliadoGrafico;
	}

	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
		}
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneDerecha(x + velocidad, y, ancho);
		Visitante visitanteEnemigo = new VisitanteB_Enemigo();
		boolean lePegue = false;
		
		for(Entidad e: listaColisionados) {
			lePegue = e.visitar(visitanteEnemigo); //De vuelve true si es Enemigo
			
			if (lePegue) { // Siempre cuando visite un enemigo va a pegarle;
				Enemigo a = (Enemigo) e;
				a.recibirGolpe(fuerza);
				///////   PRUEBA   ////////////////////////////////////////////////////////////////////////////////////////////////////
				Sonido.play(Sonido.DISPARO_FEMUR1);
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				break;
			}
		}
		
		if(!lePegue) { // Si se puede mover...
			this.mover();
		}
		else { // Aca se borra;
			this.estaVivo = false;
			mapaLogico.eliminar(this.getPosEnLista());
		}
	}
	
	public void mover() {
		this.setX(x + velocidad);
	}

	// Para las colisiones;
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

}
