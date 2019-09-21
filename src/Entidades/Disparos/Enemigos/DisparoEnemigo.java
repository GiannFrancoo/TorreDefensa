package Entidades.Disparos.Enemigos;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.Visitante;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	
	public DisparoEnemigo(int x, int y, int f) {
		super(x,y);
		this.fuerza = f;
		
		disparoEnemigoGrafico = new DisparoEnemigoGrafico(this);
	}

	
	public void mover() {
		// logico
		disparoEnemigoGrafico.mover();
		
	}
	
	public void disparoEnemigo(Enemigo e) {
		e.restarVida(fuerza);
		//this.mover();
		//deberia llamar a disparoGrafico para que cambie la imagen o algo.
	}

	
	public void disparoAliado(Aliado a) {
		
		
	}

	
	public void disparoObjeto(ObjetoVida o) {
		
		
	}


	@Override
	public void visitado(Visitante v) {
		// TODO Auto-generated method stub
		
	}

}
