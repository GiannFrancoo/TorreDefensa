package Entidades.Disparos.Objetos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Objeto;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.Visitante;
import Utilidad.Lista.Position;

public class DisparoObjeto extends Disparo{

	protected Position<Entidad> posEnLista;
	
	public DisparoObjeto(int x, int y) {
		super(x, y);
	}


	public void disparoAliado(Aliado a) {
		// Aca no hace nada.
		
	}

	
	public void disparoEnemigo(Enemigo e) {
		// Aca no hace nada.
		
	}

	public void disparoObjeto(ObjetoVida o) {
		o.restarVida(fuerza);
		//this.mover();
		//deberia llamar a disparoObjeto para que cambie la imagen o algo.
	}

	public void mover() {
	
	}

	
	public void visitado(Visitante v) {
		//ver que hacer aca.
	}

	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}


	
	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}


}
