package Entidades.Objetos.Magias;

import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;

//Por ahora no se usa, la idea es extender los efectos de las magias de esta clase.
public abstract class EfectoMagia extends Thread {
	
	protected MapaLogico mapaLogico;
	protected JLabel label;
	protected Campeon camp;
	
	public EfectoMagia(MapaLogico mapaLogico, Campeon camp) {
		this.mapaLogico = mapaLogico;
		this.label = new JLabel();
		this.camp = camp;
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.getMapaGUI().insertar(label);
		this.aplicarEfectoMagia();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.revertirEfectoMagia();
		camp.setTieneMagia(false);
		mapaLogico.getMapaGUI().remover(label);
		this.stop();
	}
	
	public abstract void aplicarEfectoMagia();
	
	public abstract void revertirEfectoMagia();
	
	
}
