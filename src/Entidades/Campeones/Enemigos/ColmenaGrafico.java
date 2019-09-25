package Entidades.Campeones.Enemigos;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;

public class ColmenaGrafico extends EntidadGrafica {

	protected Colmena colmena;
	
	public ColmenaGrafico(Colmena c, int ancho, int alto) {
		super();
		colmena = c;

		this.imagenes[0] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_estatico.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_disparando.png")); // Disparando;
		//this.imagenes[2] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Enemigos/colmena/colmena_sufriendo.png")); // Sufriendo;
		this.imagenes[3] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/enemigos/colmena/colmena_caminando.png")); // Corriendo (GIF);
		//this.imagenes[9] = new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Enemigos/colmena/colmena_tienda.png")); // Tienda;
		
		
		grafica.setBounds(new Rectangle(ancho, alto));
		//grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
	
	}
	
	
	public void disparar() {
		grafica.setIcon(imagenes[1]);
		
		
		grafica.setIcon(imagenes[0]);
		
	}

	public void restarVida() {
		grafica.setIcon(imagenes[2]);

		grafica.setIcon(imagenes[0]);
	}
	
	public void mover() {

		grafica.setLocation(colmena.getX(), colmena.getY());
		
		grafica.setIcon(new ImageIcon(imagenes[3].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;		
		//grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;

	}
	
}
