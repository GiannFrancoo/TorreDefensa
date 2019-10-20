package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitanteMovimientoEnemigo implements Visitante {

	protected Enemigo enemigo;
	
	public VisitanteMovimientoEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	
	public void visita(Enemigo e) {
		enemigo.mover();
	}

	public void visita(Aliado a) {
	}

	public void visita(ObjetoVida o) {
		enemigo.mover();
	}

	public void visita(Consumible c) {
		enemigo.mover();
	}

	public void visita(Disparo d) {
		enemigo.mover();
	}

	public void visita(Magia m) {
		enemigo.mover();
	}

}
