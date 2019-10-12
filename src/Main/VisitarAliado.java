package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public class VisitarAliado implements VisitanteDisparo{
	
	public boolean visita(Enemigo e) {
		return false;
	}

	public boolean visita(Aliado a) { // Aliado;
		return true;
	}

	public boolean visita(Objeto o) { // Barricada;
		return true;
	}
	
}
