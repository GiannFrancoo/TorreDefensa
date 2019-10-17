package Main.Animaciones;

import javax.swing.JLabel;

import Main.MapaLogico;

public abstract class HiloAnimacion extends Thread {
	
	protected MapaLogico mapaLogico;
	protected JLabel label;
	protected int tiempo;
	
	public HiloAnimacion(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
		this.label = new JLabel();
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.getMapaGUI().insertar(label);
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mapaLogico.getMapaGUI().remover(label);
		this.stop();

	}
}
