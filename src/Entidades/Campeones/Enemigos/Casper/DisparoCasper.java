package Entidades.Campeones.Enemigos.Casper;

import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoCasper extends DisparoEnemigo {

	
	public DisparoCasper(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		this.sonido = Sonido.DISPARO_FEMUR1;
		
		DisparoCasperGrafico dis = new DisparoCasperGrafico(this.mapaLogico, this, this.ancho, this.ancho);
		entidadGrafica = dis;
		
	}
	
}
