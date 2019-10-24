package Entidades.Campeones.Aliados.Azazel;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoAzazel extends DisparoAliado{

	public DisparoAzazel(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		this.sonido = Sonido.DISPARO_FEMUR1;
		
		DisparoAzazelGrafico dis = new DisparoAzazelGrafico(this.mapaLogico, this, this.ancho, this.ancho);
		entidadGrafica = dis;
		
	}
	
	

}
