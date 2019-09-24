package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Lista.Position;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	protected Position<Entidad> posEnLista;
	
	public DisparoEnemigo(int x, int y, int f, MapaLogico m) {
		super(x, y, m);
		this.fuerza = f;
		
		disparoEnemigoGrafico = new DisparoEnemigoGrafico(this, x, y);
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
		//Aca no hace nada.	
	}

	
	public void disparoObjeto(ObjetoVida o) {
		//Aca no hace nada.
	}

	public void visitado(VisitanteDisparo v) {
		// ver que hacer aca.
	}


	
	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}

	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

}
