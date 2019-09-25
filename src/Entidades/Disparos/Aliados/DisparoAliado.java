package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.VisitanteDisparo;
import Utilidad.Lista.Position;

public class DisparoAliado extends Disparo{
	//Fuerza de disparo;
	
	protected DisparoAliadoGrafico disparoAliadoGrafico;
	protected Position<Entidad> posEnLista;
	
	public DisparoAliado(int x, int y, int fuerza, MapaLogico m) {
		super(m);
		this.fuerza = fuerza;
		this.x = x;
		this.y = y;
		
		disparoAliadoGrafico = new DisparoAliadoGrafico(this);
	}

	public void mover() {
		// Ve si choco con algo!
		
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
	
	
	public void visitado(VisitanteDisparo v) {
		//ver que hacer aca.
	}

	
	public Position<Entidad> getPosEnLista() {
		return this.posEnLista;
	}

	
	public void setPosEnLista(Position<Entidad> pos) {
		this.posEnLista = pos;
	}

}
