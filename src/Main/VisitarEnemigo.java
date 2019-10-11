package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitarEnemigo implements VisitanteDisparo{

	private MapaLogico mapaLogico;
	
	public VisitarEnemigo(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}
	
	
	public void visita(Enemigo e) {
		mapaLogico.eliminarPosta(e.getPosEnLista());
	}

	
	public void visita(Aliado a) {
		
	}

	
	public void visita(Objeto o) {
		
	}

	
}
