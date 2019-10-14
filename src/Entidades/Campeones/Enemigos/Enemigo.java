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
	
	public void mover() {
		this.setX(x-velocidad);
	}
	
}
