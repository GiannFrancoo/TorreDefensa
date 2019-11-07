package Entidades.Campeones.Aliados.Mascara;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class MascaraGrafico extends CampeonGrafica{

	public MascaraGrafico(MapaLogico mapaLogico, Mascara p, int ancho, int alto) {
		super(mapaLogico);
		
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Mascara/mascara.png")); // Estatico;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 999999999);
		
	}

	
	public void golpear() {
		
	}

	
	public void golpearMelee() {
		
	}

	
	public void golpearRango() {
	}

	
	public void eliminar() {
		
	}

	
	public void recibirGolpe() {
		
	}

}
