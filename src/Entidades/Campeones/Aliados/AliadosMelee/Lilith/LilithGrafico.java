package Entidades.Campeones.Aliados.AliadosMelee.Lilith;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;

public class LilithGrafico extends EntidadGrafica {

	protected Lilith lilith;

	public LilithGrafico(Lilith l, int ancho, int alto) {
		super();
		lilith = l;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_estatico.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_disparando.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lilith/lilith_sufriendo.png")); // Sufriendo;
		
		//this.imagenes[9] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Tienda;
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
		
	}

	public void golpear() {
		grafica.setIcon(imagenes[1]);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]);
	}

	public void recibirGolpe() {
		grafica.setIcon(imagenes[2]);
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]); 
	}
}
