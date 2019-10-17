package Entidades.Campeones.Aliados.AliadosRango.Apollyon;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.EntidadGrafica;
import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class ApollyonGrafico extends CampeonGrafica {

	protected Apollyon apollyon;

	public ApollyonGrafico(MapaLogico mapaLogico, Apollyon a, int ancho, int alto) {
		super(mapaLogico);
		apollyon = a;
		
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_estatico.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_sufriendo.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Apollyon/apollyon_sufriendo.png")); // Sufriendo;
		
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
