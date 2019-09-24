package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitarEnemigo implements VisitanteDisparo{

	private MapaLogico mapaLogico;
	
	
	public void visita(Enemigo e) {
		//Aca no hace nada.
	}

	
	public void visita(Aliado a) {
		mapaLogico.eliminarPosta(a.getPosEnLista());
	}

	
	public void visita(Objeto o) {
		//Aca no hace nada.
	}

	
}
