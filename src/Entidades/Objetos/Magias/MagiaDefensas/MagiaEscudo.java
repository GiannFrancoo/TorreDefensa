package Entidades.Objetos.Magias.MagiaDefensas;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class MagiaEscudo extends Magia {
	
	protected MagiaEscudoGrafica magiaEscudoGrafica;

	public MagiaEscudo(int x, int y, MapaLogico m) {
		super(x, y, m);
		
		this.ancho = 85; 
		this.alto = 85;
		
		magiaEscudoGrafica = new MagiaEscudoGrafica(mapaLogico, this, ancho, alto);
		entidadGrafica = magiaEscudoGrafica;
	}
	
	public void setCampeon(Campeon camp) {
		this.camp = camp;
		DuracionEscudo esc = new DuracionEscudo(mapaLogico, camp);
		esc.start();
	}

	public void recibirGolpe(int d) {}
	
}
