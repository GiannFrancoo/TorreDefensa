package Entidades.Campeones.Aliados.Poop;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class PoopGrafico extends CampeonGrafica{
	
	protected Poop poop;
	
	public PoopGrafico(MapaLogico mapaLogico, Poop p, int ancho, int alto) {
		super(mapaLogico);
		poop = p;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop.png")); // Estatico;
		//this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_disparando.png")); // Disparando;
		//this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_sufriendo.png")); // Sufriendo;

		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
	}

	@Override
	public void golpear() {
	}

	@Override
	public void recibirGolpe() {
	}
	
	
}
