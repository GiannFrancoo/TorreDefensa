package Entidades.Campeones.Enemigos.Cerebro_Demonio;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class CerebroDemonioGrafico extends CampeonGrafica{

	public CerebroDemonioGrafico(MapaLogico mapaLogico, CerebroDemonio cer, int ancho, int alto) {
		super(mapaLogico);
		
		entidad = cer;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/cerebro_demonio/cerebro_demonio.png")); // Estatico;
		
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
