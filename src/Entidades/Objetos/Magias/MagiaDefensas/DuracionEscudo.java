package Entidades.Objetos.Magias.MagiaDefensas;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidades.Campeones.Campeon;
import Main.MapaLogico;
import Main.Textura;

public class DuracionEscudo extends Thread {

		
		protected MapaLogico mapaLogico;
		protected JLabel label;
		protected Campeon camp;
		
		public DuracionEscudo(MapaLogico mapaLogico, Campeon camp) {
			this.mapaLogico = mapaLogico;
			this.camp = camp;
			this.label = new JLabel();
			
			ImageIcon image = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/escudo/escudo.gif"));
			label.setBounds(new Rectangle(camp.getAncho(),  camp.getAlto()));
			label.setIcon(new ImageIcon(image.getImage().getScaledInstance(camp.getAncho(), camp.getAlto(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
			label.setLocation(camp.getX(), camp.getY());
		}
		
		@SuppressWarnings("deprecation")
		public void run() {
			mapaLogico.getMapaGUI().insertar(label);
			int vidaAnterior = camp.getVidaActual();
			camp.setVidaActual(9999999);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			camp.setVidaActual(vidaAnterior);
			mapaLogico.getMapaGUI().remover(label);
			this.stop();

		}
}
