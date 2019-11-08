package Entidades.Objetos.Magias.Escudos;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.EfectoMagia;
import Main.MapaLogico;
import Main.Textura;

public class DuracionEscudo extends EfectoMagia {
	
	private int vidaAnterior;

	public DuracionEscudo(MapaLogico mapaLogico, Campeon camp) {
		super(mapaLogico,camp);
		
		vidaAnterior = 0;
		
//		ImageIcon image = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/escudo/escudo.gif"));
//		label.setBounds(new Rectangle(110, 110));
//		label.setIcon(new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
//		label.setLocation(camp.getX()-16, camp.getY()-20);
	}
	
	@Override
	public void aplicarEfectoMagia() {
		vidaAnterior = camp.getVidaActual();
		this.camp.setVidaActual(9999999);
	}

	@Override
	public void revertirEfectoMagia() {
		this.camp.setVidaActual(vidaAnterior);
	}
	
}
