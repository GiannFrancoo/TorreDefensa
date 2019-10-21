package Entidades.Campeones.Aliados.Poop;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class PoopGrafico extends CampeonGrafica{
	
	protected Poop poop;
	
	public PoopGrafico(MapaLogico mapaLogico, Poop p, int ancho, int alto) {
		super(mapaLogico);
		poop = p;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop_1.png"));
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop_2.png"));
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop_3.png"));
		this.imagenes[3] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop_4.png"));
		this.imagenes[4] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Poop/poop_5.png"));
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;;
		grafica.setLocation(99999999, 999999999);
	}

	public void golpear() {
	}

	public void recibirGolpe() {
		int n = poop.getVidaMaxima() / 5;
		int vida = poop.getVidaActual();
		
		
		if(vida >= 5 * n) {
			grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vida < 4 * n && vida > 3 * n) {
			grafica.setIcon(new ImageIcon(imagenes[1].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vida < 3 * n && vida > 2 * n) {
			grafica.setIcon(new ImageIcon(imagenes[2].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vida < 2 * n && vida > n) {
			grafica.setIcon(new ImageIcon(imagenes[3].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
		
		if(vida < n) {
			grafica.setIcon(new ImageIcon(imagenes[4].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH)));
		}
	}

	public void golpearMelee() {
	}

	public void golpearRango() {
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
