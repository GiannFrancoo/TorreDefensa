package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteAlcanceGolpeA_Enemigo implements Visitante {
	
	protected Aliado aliado;
	
	public VisitanteAlcanceGolpeA_Enemigo(Aliado a) {
		this.aliado = a;
	}

	public void visita(Enemigo e) {
		if(aliado.getRango() >= 30)
			aliado.golpearRango();
		else
			aliado.golpearMelee();
	}

	public void visita(Aliado a) {
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

}
