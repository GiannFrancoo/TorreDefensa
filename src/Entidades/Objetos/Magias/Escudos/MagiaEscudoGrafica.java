package Entidades.Objetos.Magias.Escudos;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Main.MapaLogico;

public class MagiaEscudoGrafica extends EntidadGrafica{

	public MagiaEscudoGrafica(MapaLogico mapaLogico, MagiaEscudo magiaEscudo, int ancho, int alto) {
		super(mapaLogico);
		this.entidad = magiaEscudo;
		

		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/escudo/dropMagia.gif")); //Drop
		this.imagenes[1] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/escudo/escudo.gif")); //Efecto Magia
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 99999999);
		
	}
	
	public ImageIcon getEfectoVisual() {
		return this.imagenes[1];
	}

	@Override
	public void golpearMelee() {}

	@Override
	public void golpearRango() {}

	@Override
	public void eliminar() {}

	@Override
	public void recibirGolpe() {}

}
