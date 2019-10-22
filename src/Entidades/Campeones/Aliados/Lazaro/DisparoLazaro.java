package Entidades.Campeones.Aliados.Lazaro;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoLazaro extends DisparoAliado {
	
	public DisparoLazaro(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		this.sonido = Sonido.DISPARO_NORMAL1;
		
		DisparoLazaroGrafico d = new DisparoLazaroGrafico(mapaLogico, this, this.ancho, this.alto);
		entidadGrafica = d;
	}

}
