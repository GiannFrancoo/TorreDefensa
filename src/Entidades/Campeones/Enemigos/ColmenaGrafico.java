package Entidades.Campeones.Enemigos;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;

public class ColmenaGrafico extends EntidadGrafica {

	protected Colmena colmena;
	
	public ColmenaGrafico(Colmena c) {
		super(c);
		
		colmena = c;
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/BattleCity/down.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left.png")); // Sufriendo;
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right.png")); // Corriendo;
		
		
		grafica.setIcon(imagenes[0]); // Arranca con la imagen estatica;;
		
		grafica.setBounds(colmena.getPos().getKey(), colmena.getPos().getValue(), alto, ancho);
	}
	
	
	public void disparar() {
		grafica.setIcon(imagenes[1]);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]);
		
	}

	public void restarVida() {
		grafica.setIcon(imagenes[2]);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]);
	}
	
	public void correr() {
		grafica.setIcon(imagenes[3]);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]);
	}
	
}
