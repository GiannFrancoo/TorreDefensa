package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitanteMeleeA_Enemigo implements Visitante {
	
	private Aliado aliado;
	
	public VisitanteMeleeA_Enemigo(Aliado a) {
		this.aliado = a;
	}

	public void visita(Enemigo e) {
		e.recibirGolpe(aliado.getFueza());
	}

	public void visita(Aliado a) {
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
