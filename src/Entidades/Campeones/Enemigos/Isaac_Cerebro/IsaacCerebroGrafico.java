package Entidades.Campeones.Enemigos.Isaac_Cerebro;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;
import Main.Animaciones.AtaqueEnemigo;
import Main.Animaciones.AtaqueLilith;

public class IsaacCerebroGrafico extends CampeonGrafica{

	public IsaacCerebroGrafico(MapaLogico mapaLogico, IsaacCerebro i, int ancho, int alto) {
		super(mapaLogico);
		entidad = i;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/isaac_cerebro/isaac_cerebro.gif")); // Estatico;
		
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
