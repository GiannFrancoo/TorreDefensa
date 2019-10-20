package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Bomba;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitanteBomba implements Visitante {
	
	private Bomba bomba;
	
	public VisitanteBomba(Bomba bomba) {
		this.bomba = bomba;
	}

	public void visita(Enemigo e) {
		e.recibirGolpe(bomba.getFuerza());
	}

	public void visita(Aliado a) {
		a.recibirGolpe(bomba.getFuerza());
	}

	public void visita(ObjetoVida o) {
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

}
