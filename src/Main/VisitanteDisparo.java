package Main;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;

public interface VisitanteDisparo {

	public boolean visita(Enemigo e);
	public boolean visita(Aliado a);
	public boolean visita(Objeto o);

}
