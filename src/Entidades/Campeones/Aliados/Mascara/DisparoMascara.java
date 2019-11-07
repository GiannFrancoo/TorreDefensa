package Entidades.Campeones.Aliados.Mascara;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoMascara extends DisparoAliado{

	public DisparoMascara(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		this.sonido = Sonido.DISPARO_NORMAL1;
		DisparoMascaraGrafico dis = new DisparoMascaraGrafico(this.mapaLogico, this, this.ancho + 35, this.alto + 50); //Ancho e alto cambiado.
		entidadGrafica = dis;
	}

}
