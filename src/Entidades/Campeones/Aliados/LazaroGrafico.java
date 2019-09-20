package Entidades.Campeones.Aliados;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;

public class LazaroGrafico extends EntidadGrafica{
	
	protected Lazaro lazaro;

	public LazaroGrafico(Lazaro l) {
		super(l);
		
		lazaro = l;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_estatico.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_disparando.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/Aliados/lazarus_sufriendo.png")); // Sufriendo;
		
		grafica.setIcon(imagenes[0]); // Arranca con la imagen estatica;;
		
		grafica.setBounds(lazaro.getPos().getKey(), lazaro.getPos().getValue(), alto, ancho);
		
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
		} catch(InterruptedException e) {System.out.println("Se partio el hilo");}
		
		grafica.setIcon(imagenes[0]); 
	}

	
	
}

