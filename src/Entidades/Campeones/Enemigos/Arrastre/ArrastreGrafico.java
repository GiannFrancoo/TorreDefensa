package Entidades.Campeones.Enemigos.Arrastre;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;
import Main.Animaciones.AtaqueEnemigo;

public class ArrastreGrafico extends CampeonGrafica{

	public ArrastreGrafico(MapaLogico mapaLogico, Arrastre e, int ancho, int alto) {
		super(mapaLogico);
		
		entidad = e;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/arrastre/arrastre.gif")); // Estatico;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;		
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
