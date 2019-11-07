package Entidades.Objetos.Magias.Escudos;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class MagiaEscudo extends Magia {
	
	protected MagiaEscudoGrafica magiaEscudoGrafica;

	public MagiaEscudo(MapaLogico m) {
		super(m);
		
		this.ancho = 85; 
		this.alto = 85;
		
		magiaEscudoGrafica = new MagiaEscudoGrafica(mapaLogico, this, ancho, alto);
		entidadGrafica = magiaEscudoGrafica;
	}
	
	public void comenzarMagia(Campeon camp) { // Para pasarselo al hilo de efecto;
		DuracionEscudo esc = new DuracionEscudo(mapaLogico, camp);
		esc.start();
		this.eliminar(); // Elimina la magia y queda el efecto andando;
	}

	public void recibirGolpe(int d) {}

	
}
