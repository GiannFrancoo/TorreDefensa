package Entidades.Campeones.Aliados.Mascara;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoMascara1 extends DisparoAliado{

	public DisparoMascara1(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		
		this.sonido = Sonido.DISPARO_NORMAL1;
		DisparoMascaraGrafico1 dis = new DisparoMascaraGrafico1(this.mapaLogico, this, this.ancho, this.alto); //Ancho e alto cambiado.
		
		entidadGrafica = dis;
	}

}
