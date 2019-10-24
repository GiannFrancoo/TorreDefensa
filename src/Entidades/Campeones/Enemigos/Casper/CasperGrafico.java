package Entidades.Campeones.Enemigos.Casper;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class CasperGrafico extends CampeonGrafica{

	public CasperGrafico(MapaLogico mapaLogico, Casper cas, int alto, int ancho) {
		super(mapaLogico);
		
		entidad = cas;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/casper/casper_estatico.png")); // Estatico;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[3].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;		
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
