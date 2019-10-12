package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;
import Main.VisitanteBooleano;
import Main.VisitanteDisparo;
import Main.VisitarAliado;
import Main.VisitarBarricadaAliado;
import Utilidad.Lista.PositionList;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	
	public Enemigo(MapaLogico m) {
		super(m);
	}
	
	public void accionar() {
		this.intentarMoverse();
		//this.intentarDisparar();
	}

	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x - velocidad, y);
		VisitanteBooleano visitante = new VisitarBarricadaAliado();
		boolean puedoMoverme = true;
		
		for(Entidad e: listaColisionados) {
			puedoMoverme = !(e.visitadoBooleano(visitante)); //De vuelve true si es aliado o barrica (Se niega después);
			if (!puedoMoverme)
				break;
		}
		
		if(puedoMoverme) { // Si se puede mover...
			this.mover();
		}
		
	}
	
	
	public void mover() {
			this.setX(x-velocidad);
			//colmenaGrafico.mover(); //Cambio el label;
	}
	
	public abstract DisparoEnemigo disparar();
	
	
}
