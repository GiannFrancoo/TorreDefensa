package Entidades.Campeones.Aliados.Lilith;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;
import Main.MapaLogico;
import Main.Animaciones.AtaqueLilith;

public class LilithGrafico extends EntidadGrafica {

	public LilithGrafico(MapaLogico mapaLogico, Lilith l, int ancho, int alto) {
		super(mapaLogico);
		entidad = l;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith.png")); // Estatico;
		//this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_disparando.png")); // Disparando;
		//this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_sufriendo.png")); // Sufriendo;
		
		//this.imagenes[9] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Tienda;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}

	public void golpearMelee() {	
		AtaqueLilith al = new AtaqueLilith(mapaLogico, entidad.getX(), entidad.getY());
		al.start();
	}
	
	public void golpearRango() {
	}
	
	public void recibirGolpe() {
	}

	
	public void eliminar() {
		
	}
}
