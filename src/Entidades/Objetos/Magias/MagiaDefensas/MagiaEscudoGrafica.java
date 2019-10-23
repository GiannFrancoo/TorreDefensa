package Entidades.Objetos.Magias.MagiaDefensas;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Main.MapaLogico;

public class MagiaEscudoGrafica extends EntidadGrafica{

	public MagiaEscudoGrafica(MapaLogico mapaLogico, MagiaDefensa md, int ancho, int alto) {
		super(mapaLogico);
		entidad = md;
		

		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/escudo/escudo.gif")); // Corriendo (GIF);
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 99999999);
		
	}

	@Override
	public void golpearMelee() {}

	@Override
	public void golpearRango() {}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirGolpe() {}

}
