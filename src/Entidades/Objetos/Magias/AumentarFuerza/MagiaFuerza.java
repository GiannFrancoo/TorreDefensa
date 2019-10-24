package Entidades.Objetos.Magias.AumentarFuerza;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.Escudos.DuracionEscudo;
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

	@Override
	public void comenzarMagia(Campeon camp) {
		DuracionAumentarFuerza daf = new DuracionAumentarFuerza(mapaLogico, camp);
		daf.start();
		this.eliminar(); // Elimina la magia y queda el efecto andando;
		
	}
	
	

	public void recibirGolpe(int d) {
	}
	
}
