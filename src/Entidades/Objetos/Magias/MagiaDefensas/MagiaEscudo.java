package Entidades.Objetos.Magias.MagiaDefensas;

import Entidades.Campeones.Aliados.Lazaro.LazaroGrafico;
import Main.MapaLogico;

public class MagiaEscudo extends MagiaDefensa {
	
	protected MagiaEscudoGrafica magiaEscudoGrafica;

	public MagiaEscudo(int x, int y, MapaLogico m) {
		super(x, y, m);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		

		magiaEscudoGrafica = new MagiaEscudoGrafica(mapaLogico, this, ancho, alto);
		entidadGrafica = magiaEscudoGrafica;
	}
	
	

}
