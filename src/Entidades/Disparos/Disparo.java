package Entidades.Disparos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.MapaLogico;

public abstract class Disparo extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	protected int fuerza;


	public Disparo(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	public int getFuerza() {
		return fuerza;
	}
	
	public abstract void disparoAliado(Aliado a);
	public abstract void disparoEnemigo(Enemigo e);
	
}
