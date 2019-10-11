package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public class VisitarAliado implements VisitanteDisparo{

	private MapaLogico mapaLogico;
	
	public VisitarAliado(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}
	
	public void visita(Enemigo e) {
		
	}

	public void visita(Aliado a) {
		
	}

	public void visita(Objeto o) {
		
	}
	
	

}
