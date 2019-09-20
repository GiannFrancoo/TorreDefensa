package Entidades.Disparos.Aliados;

import Entidades.Disparos.Disparo;

public class DisparoAliado extends Disparo{
	//Fuerza de disparo;
	
	protected DisparoAliadoGrafico disparoAliadoGrafico;
	
	public DisparoAliado(int x, int y, int fuerza) {
		super(x,y);
		this.fuerza = fuerza;
		
		disparoAliadoGrafico = new DisparoAliadoGrafico(this);
	}

	public void mover() {
		// logico
		disparoAliadoGrafico.mover();
	}
}
