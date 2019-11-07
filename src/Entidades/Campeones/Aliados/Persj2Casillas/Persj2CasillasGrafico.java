package Entidades.Campeones.Aliados.Persj2Casillas;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class Persj2CasillasGrafico extends CampeonGrafica{

	public Persj2CasillasGrafico(MapaLogico mapaLogico, Pers2Casillas p, int ancho, int alto) {
		super(mapaLogico);
		
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Mascara/mascara.png")); // Estatico;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		
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
