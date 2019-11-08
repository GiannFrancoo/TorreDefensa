package Entidades.Objetos.Magias.AumentarFuerza;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidades.EntidadGrafica;
import Main.MapaLogico;

public class MagiaFuerzaGrafica extends EntidadGrafica{

	public MagiaFuerzaGrafica(MapaLogico mapaLogico, MagiaFuerza mag, int ancho, int alto) {
		super(mapaLogico);
		this.entidad = mag;
    
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/disparos/portalAnimado.gif")); //Drop
		this.imagenes[1] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/disparos/portalAnimado.gif")); //Efecto Visual
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT)));
		
		
	}

	public ImageIcon getEfectoVisual() {
		return this.imagenes[1];
	}
	
	public void golpearMelee() {}

	
	public void golpearRango() {}


	public void eliminar() {}

	
	public void recibirGolpe() {}

}
