package Entidades.Objetos.Consumibles;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Lazaro.LazaroGrafico;
import Main.MapaLogico;
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
		this.tiempoExplocion = 4000;
		this.tiempoActual = 4000;
		this.radio = 50;
		
		BombaGrafico bombaGrafico= new BombaGrafico(this, ancho, alto);
		entidadGrafica = bombaGrafico;
	}

	@Override
	public void accionar() {
		if (tiempoActual == 0) {
			//Rango de explocion cuadrado. Coordenadas del extremo superior izquierdo.
			int cX = (getX() + (getAncho()/2)) - this.radio; //Centro de la bomba - radio.
			int cY = (getY() + (getAlto()/2)) - this.radio; //Centro de la bomba - radio.
			//Explotar
			boolean alcanzado = false;
			for (Entidad e : mapaLogico.getListaEntidades()) {
				if ((e.getX() >= cX && e.getX()+e.getAncho() <= cX+this.radio*2)  &&  (e.getY() >= cY && e.getY()+e.getAlto() <= cY+this.radio*2)) {
					alcanzado = e.visitado(visitante); //Tiene que visitar Aliados y Enemigos.
					if (alcanzado) {
						e.recibirGolpe(fuerza);
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

	@Override
	public void recibirGolpe(int d) {
		// TODO Auto-generated method stub
		
	}

}
