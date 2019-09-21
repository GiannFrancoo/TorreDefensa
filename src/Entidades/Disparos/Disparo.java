package Entidades.Disparos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

public abstract class Disparo extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	
	protected int fuerza;

	public Disparo(int x, int y) {
		super(x, y);
	}

	public int getFuerza() {
		return fuerza;
	}
	
	public abstract void disparoAliado(Aliado a);
	public abstract void disparoEnemigo(Enemigo e);
	public abstract void disparoObjeto(ObjetoVida o);
	
}
