package Entidades.Objetos.Consumibles;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Main.MapaLogico;
import Main.Animaciones.ExplosionBomba;

public class BombaGrafico extends EntidadGrafica{
	
	protected Bomba bomba;
	
	public BombaGrafico(MapaLogico mapaLogico, Bomba bomba, int ancho, int alto) {
		super(mapaLogico);
		this.bomba = bomba;		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/objetos/bomba/bomba.gif")).getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}
	
	public void golpearMelee() {
		ExplosionBomba b = new ExplosionBomba(mapaLogico, bomba.getX(), bomba.getY());
		b.start();
	}

	public void golpearRango() {
	}

	public void eliminar() {
	}

	public void recibirGolpe() {
	}
}
