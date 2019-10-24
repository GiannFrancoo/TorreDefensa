package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class VisitanteEnemigo implements Visitante{

	protected MapaLogico mapaLogico;
	
	public VisitanteEnemigo(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}
	
	@Override
	public void visita(Enemigo e) {
		mapaLogico.hayEnemigos(true);
	}

	@Override
	public void visita(Aliado a) {
	}

	@Override
	public void visita(Consumible c) {
	}

	@Override
	public void visita(Disparo d) {		
	}

	@Override
	public void visita(Magia m) {
	}

}
