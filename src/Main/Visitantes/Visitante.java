package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public interface Visitante {
	
	public void visita(Enemigo e);
	public void visita(Aliado a);
	public void visita(ObjetoVida o);
	public void visita(Consumible c);
	public void visita(Disparo d);
	public void visita(Magia m);
}
