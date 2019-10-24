package Entidades.Objetos.Magias.AumentarFuerza;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.Escudos.MagiaEscudoGrafica;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class MagiaFuerza extends Magia {
	protected MagiaFuerzaGrafica magiaFuerzaGrafica;
	
	public MagiaFuerza(int x, int y, MapaLogico m) {
		super(x, y, m);
		
		this.ancho = 85; 
		this.alto = 85;
		
		 magiaFuerzaGrafica = new MagiaFuerzaGrafica(mapaLogico, this, ancho, alto);
		entidadGrafica = magiaFuerzaGrafica;
	}

	public void recibirGolpe(int d) {
	}

	@Override
	public void comenzarMagia(Campeon camp) {
		//llama hilo;
		
	}
	
}
