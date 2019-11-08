package Entidades.Campeones.Aliados.Piedra;


import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class PiedraGrafico extends CampeonGrafica{

	public PiedraGrafico(MapaLogico mapaLogico, Piedra p, int ancho, int alto) {
		super(mapaLogico);
		entidad = p;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/objetos/piedra/piedra.png"));
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
	}

	public void golpear() {}
	
	public void recibirGolpe() {}

	public void golpearMelee() {}

	public void golpearRango() {}

	public void eliminar() {}
	

}
