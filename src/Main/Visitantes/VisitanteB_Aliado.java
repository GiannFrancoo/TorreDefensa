package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public class VisitanteB_Aliado implements VisitanteBooleano{

	public boolean visita(Enemigo e) {
		return false;
	}

	public boolean visita(Aliado a) {
		return true;
	}

	public boolean visita(ObjetoVida o) {
		return false;
	}

	public boolean visita(Consumible c) {
		return false;
	}

	public boolean visita(Disparo d) {
		return false;
	}

	public boolean visita(Magia m) {
		return false;
	}

}
