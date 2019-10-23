package Entidades.Campeones.Aliados.BlueBaby;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.Campeones.CampeonGrafica;
import Main.MapaLogico;

public class BlueBabyGrafico extends CampeonGrafica{

	protected BlueBaby blueBaby;
	
	public BlueBabyGrafico(MapaLogico mapaLogico, BlueBaby b, int alto, int ancho) {
		super(mapaLogico);
		
		this.blueBaby = b;
		
		
		//this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_estatico.png"));
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_SMOOTH))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 999999999);
	}

	
	public void golpear() {
		// TODO Auto-generated method stub
		
	}

	
	public void golpearMelee() {
		// TODO Auto-generated method stub
		
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
