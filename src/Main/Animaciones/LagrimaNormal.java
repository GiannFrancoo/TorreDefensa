package Main.Animaciones;

import java.awt.Image;

import javax.swing.ImageIcon;

import Main.MapaLogico;

public class LagrimaNormal extends HiloAnimacion {

	public LagrimaNormal(MapaLogico mapaLogico, int x, int y) {
		super(mapaLogico);
		this.label.setBounds(x, y, 75, 75);
		this.label.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("texturas/disparos/GIAN/desaparecerLagrima.gif")).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
		this.tiempo = 1000;
	}
	
}
