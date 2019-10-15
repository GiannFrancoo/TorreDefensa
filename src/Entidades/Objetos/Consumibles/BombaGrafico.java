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
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/objetos/bomba.gif"));
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/objetos/bomba_explosion.gif"));

		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}
	
	public void explotar() {
		grafica.setBounds(new Rectangle(bomba.getAncho()+200, bomba.getAlto()+200));
		this.grafica.setLocation(bomba.getX()-100, bomba.getY()-130);

		this.grafica.setIcon(new ImageIcon(this.imagenes[1].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT)));

//////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////  COMO MANTENER EL LABEL SIN FRENAR EL HILO  ////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
//		try {
//			Thread.sleep(940);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
