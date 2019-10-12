package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public class VisitarEnemigo implements VisitanteDisparo{
	
	public boolean visita(Enemigo e) { // Enemigo;
		return true;
	}
	
	public boolean visita(Aliado a) {
		return false;
	}
	
	public boolean visita(Objeto o) {
		return false;
	}


}
