package Main.Animaciones;

import java.awt.Image;

import javax.swing.ImageIcon;

import Main.MapaLogico;

public class AtaqueEnemigo extends HiloAnimacion{

	public AtaqueEnemigo(MapaLogico mapaLogico, int x, int y) {
		super(mapaLogico);
		//this.label.setBounds(x+25, y, 110, 110); // Para la HOZ;
		this.label.setBounds(x-80, y-23, 110, 110); // Para la Faka;
		this.label.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("texturas/disparos/ataqueEnemigo.gif")).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
		this.tiempo = 500;
	}

}
