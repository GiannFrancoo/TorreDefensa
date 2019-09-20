package Entidades.Disparos.Enemigos;

import Entidades.Disparos.Disparo;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	
	public DisparoEnemigo(int x, int y, int f) {
		super(x,y);
		this.fuerza = f;
		
		disparoEnemigoGrafico = new DisparoEnemigoGrafico(this);
	}

	@Override
	public void mover() {
		// logico
		disparoEnemigoGrafico.mover();
		
	}
}
