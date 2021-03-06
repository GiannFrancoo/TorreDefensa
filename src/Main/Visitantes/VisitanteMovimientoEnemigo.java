package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EATiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteMovimientoEnemigo implements Visitante {

	protected Enemigo enemigo;
	
	public VisitanteMovimientoEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	
	public void visita(Enemigo e) {
	}

	public void visita(Aliado a) {
		enemigo.setMoverme(false);
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

	public void visita(EAVida e) {
		enemigo.setMoverme(false);
	}

	public void visita(EATiempo e) {
	}


}
