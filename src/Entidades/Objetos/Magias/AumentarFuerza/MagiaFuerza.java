package Entidades.Objetos.Magias.AumentarFuerza;

import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.Escudos.DuracionEscudo;
import Entidades.Objetos.Magias.Escudos.MagiaEscudoGrafica;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class MagiaFuerza extends Magia {
	
	protected MagiaFuerzaGrafica magiaFuerzaGrafica;
	
	public MagiaFuerza(MapaLogico m) {
		super(m);
		
		this.ancho = 85; 
		this.alto = 85;
		
		magiaFuerzaGrafica = new MagiaFuerzaGrafica(mapaLogico, this, ancho, alto);
		entidadGrafica = magiaFuerzaGrafica;
	}

	public void comenzarMagia(Campeon camp) {
		DuracionAumentarFuerza daf = new DuracionAumentarFuerza(mapaLogico, camp);
		daf.start();		
	}
	
	public void recibirGolpe(int d) {}

	public JLabel getEfectoVisual() {
		return entidadGrafica.getEfectoVisual();
	}
	
}
