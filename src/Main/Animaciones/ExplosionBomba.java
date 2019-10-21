package Main.Animaciones;

import java.awt.Image;

import javax.swing.ImageIcon;

import Main.MapaLogico;
import Main.Animaciones.HiloAnimacion;

public class ExplosionBomba extends HiloAnimacion {

	public ExplosionBomba(MapaLogico mapaLogico, int x, int y) {
		super(mapaLogico);
		this.label.setBounds(x-100, y-130, 285, 285);
		this.label.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("texturas/objetos/bomba_explosion.gif")).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
		this.tiempo = 1000;
	}

}
