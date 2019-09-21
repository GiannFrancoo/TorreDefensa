package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public class VisitarEnemigo implements Visitante{

	private MapaLogico mapaLogico;
	
	
	public void visita(Enemigo e) {
		mapaLogico.eliminarPosta(e.getPosEnLista());
	}

	
	public void visita(Aliado a) {
		//Aca no hace nada.
	}

	
	public void visita(Objeto o) {
		//Aca no hace nada.
	}

	
}
