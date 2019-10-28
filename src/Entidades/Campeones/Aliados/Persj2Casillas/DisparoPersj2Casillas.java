package Entidades.Campeones.Aliados.Persj2Casillas;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;

public class DisparoPersj2Casillas extends DisparoAliado{

	public DisparoPersj2Casillas(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		DisparoPersj2CasillasGrafico dis = new DisparoPersj2CasillasGrafico(this.mapaLogico, this, this.ancho, this.alto);
		entidadGrafica = dis;
	}

}
