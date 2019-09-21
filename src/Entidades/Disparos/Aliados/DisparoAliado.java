package Entidades.Disparos.Aliados;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;

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

	
	public void disparoAliado(Aliado a) {
		a.restarVida(fuerza);
		//this.mover();
		//deberia llamar a disparoGrafico para que cambie la imagen o algo.
	}

	
	public void disparoEnemigo(Enemigo e) {
		//No se hace nada aca.
	}

	
	public void disparoObjeto(ObjetoVida o) {
		//No se hace nada aca.
	}

}
