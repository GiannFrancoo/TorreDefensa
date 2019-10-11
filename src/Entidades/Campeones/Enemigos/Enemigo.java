package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Main.VisitarAliado;
import Utilidad.Lista.PositionList;

public abstract class Enemigo extends Campeon{
	
	protected int velocidad;
	
	public Enemigo(MapaLogico m) {
		super(m);
	}

	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisione(x - velocidad, y);
		VisitarAliado visitante = new VisitarAliado(mapaLogico);
		boolean puedeMover;
		
		for(Entidad e: listaColisionados) {
			!e.visitado(visitante)
				break;
			
			
		}
		
	}
	
	
	public void mover() {
			x = x - velocidad; //Se mueve;
			colmenaGrafico.mover(); //Cambio el label;
	}
	
	public abstract DisparoEnemigo disparar();
	
	
}
