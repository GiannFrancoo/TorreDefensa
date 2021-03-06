package Entidades.Campeones.Enemigos.Cerebro;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;
import Main.Animaciones.AtaqueEnemigo;

public class CerebroGrafico extends CampeonGrafica{

	public CerebroGrafico(MapaLogico mapaLogico, Cerebro cer, int ancho, int alto) {
		super(mapaLogico);
		entidad = cer;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/cerebro/cerebro.gif")); // Estatico;
	
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;		
		grafica.setLocation(99999999, 999999999);
	}

	@Override
	public void golpear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void golpearMelee() {
		AtaqueEnemigo al = new AtaqueEnemigo(mapaLogico, entidad.getX(), entidad.getY());
		al.start();
	}

	@Override
	public void golpearRango() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirGolpe() {
		// TODO Auto-generated method stub
		
	}

}
