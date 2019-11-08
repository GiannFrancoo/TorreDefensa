package Entidades.Campeones.Enemigos.Arrastre;

import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoArrastre extends DisparoEnemigo{

	public DisparoArrastre(int x, int y, int fuerza, int rango, MapaLogico mapaLogico) {
		super(x, y, fuerza, rango, mapaLogico);
		
		this.sonido = Sonido.DISPARO_FEMUR1;
		
		DisparoArrastreGrafico dis = new DisparoArrastreGrafico(this.mapaLogico, this, this.ancho, this.ancho);
		entidadGrafica = dis;
	}

	
	

}
