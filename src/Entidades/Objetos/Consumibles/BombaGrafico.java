package Entidades.Objetos.Consumibles;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;

public class BombaGrafico extends EntidadGrafica{
	
	protected Bomba bomba;
	
	public BombaGrafico(Bomba l, int ancho, int alto) {
		super();
		bomba = l;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/objetos/bomba.png"));
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}
}
