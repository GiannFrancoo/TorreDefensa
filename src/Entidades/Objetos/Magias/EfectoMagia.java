package Entidades.Objetos.Magias;

import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;

//Por ahora no se usa, la idea es extender los efectos de las magias de esta clase.
public abstract class EfectoMagia extends Thread {
	
	protected MapaLogico mapaLogico;
	protected JLabel label;
	protected Campeon camp;
	
	public EfectoMagia(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
		this.label = new JLabel();
	}
	
	public abstract void run();
}
