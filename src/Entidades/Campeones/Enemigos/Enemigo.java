package Entidades.Campeones.Enemigos;

import Entidades.Campeones.Campeon;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Utilidad.Pair;

public abstract class Enemigo extends Campeon{

	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	protected int velocidad;
	protected int cantMonedas;
	
	public Enemigo(int x, int y) {
		super(x,y);
	}

	public abstract void mover();
	
	public abstract DisparoEnemigo disparar();
	
	
}
