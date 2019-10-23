package Entidades.Campeones.Aliados.BlueBaby;

import Entidades.Campeones.Aliados.Azazel.DisparoAzazelGrafico;
import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;

public class DisparoBlueBaby extends DisparoAliado{

	public DisparoBlueBaby(int x, int y, int fuerza, int rango, MapaLogico m) {
		
		
		super(x, y, fuerza, rango, m);
		
		DisparoBlueBabyGrafico dis = new DisparoBlueBabyGrafico(this.mapaLogico, this, this.ancho, this.ancho);
		entidadGrafica = dis;
		
	}

}
