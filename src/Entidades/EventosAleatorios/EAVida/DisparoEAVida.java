package Entidades.EventosAleatorios.EAVida;

import Entidades.Disparos.Aliados.DisparoAliado;
import Main.MapaLogico;
import Main.Sonido;

public class DisparoEAVida extends DisparoAliado{

	public DisparoEAVida(int x, int y, int fuerza, int rango, MapaLogico m) {
		super(x, y, fuerza, rango, m);
		
		
		this.sonido = Sonido.DISPARO_NORMAL1;
		DisparoEAVidaGrafico DisparoEAVGrafico = new DisparoEAVidaGrafico(m, this, this.alto + 50, this.ancho); //Se modifico el alto. 
		entidadGrafica = DisparoEAVGrafico;
	}
	

}
