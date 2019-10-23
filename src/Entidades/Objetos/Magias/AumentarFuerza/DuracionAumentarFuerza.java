package Entidades.Objetos.Magias.AumentarFuerza;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Textura;

public class DuracionAumentarFuerza extends Thread{

	
	protected MapaLogico mapaLogico;
	protected JLabel label;
	protected Campeon camp;
	
	public DuracionAumentarFuerza(MapaLogico mapaLogico, Campeon camp) {
		this.mapaLogico = mapaLogico;
		this.label = new JLabel();
		this.camp = camp;
		
		ImageIcon image = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/escudo/escudo.gif"));
		label.setBounds(new Rectangle(110, 110));
		label.setIcon(new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		label.setLocation(camp.getX()-16, camp.getY()-20);
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.getMapaGUI().insertar(label);
		int fuerzaAnterior = camp.getVidaActual();
		//camp.setVidaActual(9999999);
		camp.setFuerza(9999999);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		camp.setVidaActual(vidaAnterior);
//		mapaLogico.getMapaGUI().remover(label);
//		this.stop();
		
		camp.setFuerza(fuerzaAnterior);
		mapaLogico.getMapaGUI().remover(label);
		this.stop();
	}
}
