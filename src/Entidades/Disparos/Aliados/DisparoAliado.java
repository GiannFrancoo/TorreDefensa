package Entidades.Disparos.Aliados;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Enemigo;
import Main.Visitantes.VisitanteBooleano;
import Utilidad.Lista.Position;
import Utilidad.Lista.PositionList;

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

	public void accionar() {
		this.intentarMoverse(); // Intenta pegarle a algo;
		//disparoAliadoGrafico.mover();
	}
	
	public void intentarMoverse() {
		PositionList<Entidad> listaColisionados = mapaLogico.colisioneDerecha(x - velocidad, y, ancho);
		VisitanteBooleano visitanteEnemigo = new VisitanteB_Enemigo();
		boolean lePegue = false;
		
		for(Entidad e: listaColisionados) {
			lePegue = e.visitadoBooleano(visitanteEnemigo); //De vuelve true si es Enemigo
			
			if (lePegue) { // Siempre cuando visite un enemigo va a pegarle;
				e.recibirGolpe(fuerza);
				break;
			}
		}
		
		if(!lePegue) { // Si se puede mover...
			this.mover();
		}
		else {
			// Deberia borrarse;
		}
	}
	
	public void mover() {
		this.setX(x - velocidad);
	}

	// Para las colisiones;
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

	@Override
	public void recibirGolpe(int d) {
		// TODO Auto-generated method stub
		
	}

}
