package Entidades.Campeones.Enemigos.EnemigosRango;

import Entidades.Entidad;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteMovimientoEnemigo;
import Utilidad.Lista.PositionList;

public abstract class EnemigoRango extends Enemigo {

	protected int rango;
	
	public EnemigoRango(MapaLogico m) {
		super(m);
		this.visitante = new VisitanteMovimientoEnemigo(this);
	}
	
	public int getRango() {
		return rango;
	}
	
	public void accionar() {
		if (this.estaVivo) {
			this.intentarMoverse();
			//this.intentarGolpear();
		}
	}
	
	//VER MOVIMIENTO
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		
		for(Entidad e: listaColisionados) {
			e.visitar(visitante);
		}
		
	//}
	
	

}
