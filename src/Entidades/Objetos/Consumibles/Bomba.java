package Entidades.Objetos.Consumibles;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Visitantes.VisitanteB_Aliado;
import Main.Visitantes.VisitanteB_Enemigo;
import Main.Visitantes.VisitanteBooleano;
import Utilidad.Lista.Position;

public class Bomba extends Consumible {
	
	protected int tiempoExplocion;
	protected int tiempoActual;
	protected int radio; //De explocion (ES UN CUADRADO)

	public Bomba(MapaLogico m) {
		super(m);
		this.alto = 75;
		this.ancho = 75;
		this.fuerza = 999999;
		this.tiempoExplocion = 50;
		this.tiempoActual = tiempoExplocion;
		this.radio = 50;
		
		BombaGrafico bombaGrafico= new BombaGrafico(this, ancho, alto);
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
			VisitanteBooleano visitoEnemigo = new VisitanteB_Enemigo();
			VisitanteBooleano visitoAliado = new VisitanteB_Aliado();
			for (Entidad e : mapaLogico.getListaEntidades()) {
				int leftX = e.getX() ;
				int rightX = e.getX()+e.getAncho();
				int topY =  e.getY();
				int botY =  e.getY()+e.getAlto();
				if (((leftX >= rX && leftX <= rX+anchoC) && (topY >= rY && topY <= rY+altoC)) || ((leftX >= rX && leftX <= rX+anchoC) && (botY >= rY && botY <= rY+altoC)) || ((rightX >= rX && rightX <= rX+anchoC) && (topY >= rY && topY <= rY+altoC)) || ((rightX >= rX && rightX <= rX+anchoC) && (botY >= rY && botY <= rY+altoC))) {
					if (e.visitadoBooleano(visitoEnemigo)) {
						Enemigo a = (Enemigo) e;
						a.recibirGolpe(fuerza);
					}
					if(e.visitadoBooleano(visitoAliado)){
						Aliado a = (Aliado) e;
						a.recibirGolpe(fuerza);
					}
				}
			}
			//Auto-Eliminarse
			mapaLogico.eliminarPosta(this.getPosEnLista());
		} else {
			--tiempoActual;
		}
	}


	@Override
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

}
