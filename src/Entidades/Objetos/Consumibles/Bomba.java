package Entidades.Objetos.Consumibles;

import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Main.MapaLogico;
import Main.Sonido;
import Main.Visitantes.Visitante;
import Main.Visitantes.VisitanteBomba;

public class Bomba extends Consumible {
	
	protected int tiempoExplosion;
	protected int tiempoActual;
	protected int radio; //De explosion (ES UN CUADRADO)
	protected BombaGrafico bombaG;

	public Bomba(MapaLogico m) {
		super(m);
		this.alto = 85;
		this.ancho = 85;
		this.fuerza = 999999;
		this.tiempoExplosion = 50;
		this.tiempoActual = tiempoExplosion;
		this.radio = 85;
		this.monedas = 25;
		
		this.visitante = new VisitanteBomba(this);
		
		BombaGrafico bombaGrafico= new BombaGrafico(mapaLogico, this, ancho, alto);
		bombaG = bombaGrafico;
		entidadGrafica = bombaGrafico;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}

	@Override
	public void accionar() {
		
		if (this.estaVivo) {
		
			if (tiempoActual == 0) {
				//Rango de exploSion cuadrado. Coordenadas del extremo superior izquierdo.
				int cX = (getX() + (getAncho()/2)); //Centro de la bomba.
				int cY = (getY() + (getAlto()/2)); //Centro de la bomba.
				
				int rX = cX - this.radio; //Esquina superior izquierda
				int rY = cY - this.radio;
				
				//Explotar
				for (Entidad e : mapaLogico.colisioneRango(rX, rX+(this.radio*2), rY, rY+(this.radio*2))) {
					e.visitar(visitante);
				}
				
				//Auto-Eliminarse
				Sonido.BOMBA.play();
				this.entidadGrafica.golpearMelee();
				this.eliminar();
			} else {
				--tiempoActual;
			}
		
		}
		
	}


	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

	public void recibirGolpe(int d) {
	}

}
