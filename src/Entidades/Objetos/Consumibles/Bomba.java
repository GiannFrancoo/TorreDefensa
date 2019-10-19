package Entidades.Objetos.Consumibles;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Sonido;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.VisitanteB_Enemigo;
import Main.Visitantes.Visitante;

public class Bomba extends Consumible {
	
	protected int tiempoExplocion;
	protected int tiempoActual;
	protected int radio; //De explocion (ES UN CUADRADO)
	protected BombaGrafico bombaG;

	public Bomba(MapaLogico m) {
		super(m);
		this.alto = 85;
		this.ancho = 85;
		this.fuerza = 999999;
		this.tiempoExplocion = 50;
		this.tiempoActual = tiempoExplocion;
		this.radio = 50;
		
		BombaGrafico bombaGrafico= new BombaGrafico(mapaLogico, this, ancho, alto);
		bombaG = bombaGrafico;
		entidadGrafica = bombaGrafico;
	}

	@Override
	public void accionar() {
		if (tiempoActual == 0) {
			//Rango de explocion cuadrado. Coordenadas del extremo superior izquierdo.
			int cX = (getX() + (getAncho()/2)); //Centro de la bomba.
			int cY = (getY() + (getAlto()/2)); //Centro de la bomba.
			
			int rX = cX - this.radio; //Esquina superior izquierda
			int rY = cY - this.radio;
			int anchoC = this.radio * 2;
			int altoC = this.radio * 2;
			
			//Explotar
			Visitante visitoEnemigo = new VisitanteB_Enemigo();
			Visitante visitoAliado = new VisitanteB_Aliado();
			for (Entidad e : mapaLogico.getListaEntidades()) {
				int leftX = e.getX() ;
				int rightX = e.getX()+e.getAncho();
				int topY =  e.getY();
				int botY =  e.getY()+e.getAlto();
				if (((leftX >= rX && leftX <= rX+anchoC) && (topY >= rY && topY <= rY+altoC)) || ((leftX >= rX && leftX <= rX+anchoC) && (botY >= rY && botY <= rY+altoC)) || ((rightX >= rX && rightX <= rX+anchoC) && (topY >= rY && topY <= rY+altoC)) || ((rightX >= rX && rightX <= rX+anchoC) && (botY >= rY && botY <= rY+altoC))) {
					if (e.visitar(visitoEnemigo)) {
						Enemigo a = (Enemigo) e;
						a.recibirGolpe(fuerza);
					}
					if(e.visitar(visitoAliado)){
						Aliado a = (Aliado) e;
						a.recibirGolpe(fuerza);
					}
				}
			}
			//Auto-Eliminarse
			Sonido.play(Sonido.BOMBA);
			this.bombaG.explotar();
			mapaLogico.eliminar(this.getPosEnLista());
		} else {
			--tiempoActual;
		}
	}


	@Override
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

}
