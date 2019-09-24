package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public interface VisitanteDisparo {

	void visita(Enemigo e);
	void visita(Aliado a);
	void visita(Objeto o);

}
