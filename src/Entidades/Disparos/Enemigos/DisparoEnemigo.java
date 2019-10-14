package Entidades.Disparos.Enemigos;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.ObjetosVida.ObjetoVida;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.VisitanteB_Barricada;
import Main.Visitantes.VisitanteBooleano;
import Utilidad.Lista.Position;
import Utilidad.Lista.PositionList;

public class DisparoEnemigo extends Disparo {
	//Fuerza de disparo;
	
	protected DisparoEnemigoGrafico disparoEnemigoGrafico;
	protected Position<Entidad> posEnLista;
	
	public DisparoEnemigo(int x, int y, int fuerza, MapaLogico m){
		super(m);
		this.fuerza = fuerza;
		this.x = x;
		this.y = y;
		
		disparoEnemigoGrafico = new DisparoEnemigoGrafico(this);
	}

	
	public void accionar() {
		// logico
		//disparoEnemigoGrafico.mover();
		this.intentarMoverse();
		
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneIzquierda(x - velocidad, y);
		VisitanteBooleano visitanteAliado = new VisitanteB_Aliado();
		boolean lePegue = false;
		
		// Barricadas
		for(Entidad e: listaColisionados) {
			lePegue = e.visitadoBooleano(visitanteAliado); // Ve si esa entidad es una Aliado
			
			if (lePegue) { // Le pega sea aliado o barricada y despues corta
				Aliado a = (Aliado) e;
				a.recibirGolpe(fuerza);
				break;
			}	
		}
		
		if(!lePegue) { // Si se puede mover...
			this.mover();
		}
		else {
			// Deberia borarse;
		}
	}
	
	public void mover() {
		this.setX(x - velocidad);
	}
	
	// Para las colisiones
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

	// Metodo que no hace nada, por heredad de entidad;
	public void recibirGolpe(int d) {}

}
