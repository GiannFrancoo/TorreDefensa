package Entidades.Campeones.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Campeon;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Barricada;
import Main.Visitantes.VisitanteBooleano;
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
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		VisitanteBooleano visitante = new VisitanteB_Barricada();
		boolean puedoMoverme = true;
		
		for(Entidad e: listaColisionados) {
			puedoMoverme = !(e.visitadoBooleano(visitante)); //De vuelve true si es aliado o barrica (Se niega despues);
			if (!puedoMoverme)
				break;
		}
		
		if(puedoMoverme) { // Si se puede mover...
			this.mover();
		}
		
	}
	
	public void intentarDisparar() {
		//Falta implementar;
	}
	
	
	public void mover() {
			this.setX(x-velocidad);
			//grafica.mover(); //Cambio el label;
	}
		
		
}
