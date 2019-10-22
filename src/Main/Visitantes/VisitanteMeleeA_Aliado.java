package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteMeleeA_Aliado implements Visitante {

	private Enemigo enemigo;
	
	public VisitanteMeleeA_Aliado(Enemigo e) {
		this.enemigo = e;
	}
	
	public void visita(Enemigo e) {
	}

	public void visita(Aliado a) {
		System.out.println("....");
		a.recibirGolpe(enemigo.getFueza());
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

}
