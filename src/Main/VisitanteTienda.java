package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;


public abstract class VisitanteTienda {
	protected MapaLogico m;
	protected Jugador jugador; 
	
	public abstract void visitaVender(Aliado a);
	public abstract void visitaVender(Enemigo e);
	public abstract void visitaVender(Objeto o);
}
