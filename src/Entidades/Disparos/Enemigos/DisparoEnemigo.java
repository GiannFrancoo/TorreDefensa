package Entidades.Disparos.Enemigos;

import Entidades.Disparos.Disparo;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	public DisparoEnemigo(int x, int y, int f) {
		super(x,y);
		this.fuerza = f;
	}
}
