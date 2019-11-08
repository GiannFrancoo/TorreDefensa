package Entidades.Campeones.Enemigos;

import java.util.Random;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteAlcanceGolpeA_Aliado;
import Main.Visitantes.VisitanteMeleeA_Aliado;
import Main.Visitantes.VisitanteMovimientoEnemigo;
import Utilidad.Lista.PositionList;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	protected boolean puedoMoverme;
	//protected Visitante visitanteMelee;
	protected Visitante visitanteMovimiento;
	
	public Enemigo(MapaLogico m) {
		super(m);
		this.puedoMoverme = true;
		
		//this.visitanteMelee = new VisitanteMeleeA_Aliado(this);
		//this.visitante = new VisitanteMovimientoEnemigo(this);

		this.visitanteAlcance = new VisitanteAlcanceGolpeA_Aliado(this);
		this.visitante = new VisitanteMeleeA_Aliado(this);
		this.visitanteMovimiento = new VisitanteMovimientoEnemigo(this);
	}	
	
	public void recibirGolpe(int d) {
		vidaActual -= d;
		if(vidaActual <= 0) {
			this.mapaLogico.getJugador().agregarMonedas(this.monedas);
			this.mapaLogico.getTienda().actualizarMonedas();
			Random rnd = new Random();
			if (rnd.nextInt(4) == 0){
				Magia drop = this.mapaLogico.getMagiaRandom();
				this.mapaLogico.insertar(drop);
				drop.setX(getX());
				drop.setY(getY());
			}
			mapaLogico.restarEnemigo();
			this.eliminar();
		}
		this.entidadGrafica.recibirGolpe();
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			this.intentarGolpear();
		}
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x - velocidad, y);
		
		for(Entidad e: listaColisionados) {
			e.visitar(visitanteMovimiento);
		}
		if (this.puedoMoverme) {
			mover();
		}
		this.puedoMoverme = true;
		
	}
	
	public void mover() {
		this.setX(x-velocidad);
		if (tieneMagia) {
			this.entidadGrafica.moverMagia(this.getX(), this.getY());
		}
		if (this.getX() < 233) {
			mapaLogico.perderJuego();
		}
	}
	
	public void setMoverme(boolean b) {
		this.puedoMoverme = b;
	}
	
	public void intentarGolpear() {
		if (this.dpsTiming == 0) {
			PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(x - this.rango, x-1, y, y + this.getAlto());
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
	
	
	public void golpearMelee() {
		this.dpsTiming = dps;
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneRango(x - this.rango, x-1, y, y + this.getAlto());
		for (Entidad e : listaColisionados) {
			e.visitar(visitante);
		}
		this.entidadGrafica.golpearMelee();
	}
	
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

}
