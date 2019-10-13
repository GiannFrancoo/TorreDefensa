package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public interface VisitanteBooleano {
	
	public boolean visita(Enemigo e);
	public boolean visita(Aliado a);
	public boolean visita(ObjetoVida o);
	public boolean visita(Consumible c);
	public boolean visita(Disparo d);
	public boolean visita(Magia m);
}
