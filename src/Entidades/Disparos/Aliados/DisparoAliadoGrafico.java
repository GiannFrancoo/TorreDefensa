package Entidades.Disparos.Aliados;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import Entidades.EntidadGrafica;

public class DisparoAliadoGrafico extends EntidadGrafica {

	protected DisparoAliado disparoAliado;
	
	public DisparoAliadoGrafico(DisparoAliado e, int ancho, int alto) {
		super();
		disparoAliado = e;
		
//		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/aliados/Lazaro/lazaro_estatico.png")); // Estatico;
		this.imagenes[0] = new ImageIcon(getClass().getClassLoader().getResource("texturas/disparos/portalAnimado.gif")); // Estatico;
		
		
		grafica.setBounds(new Rectangle(ancho, alto));
		grafica.setIcon(new ImageIcon(imagenes[0].getImage().getScaledInstance(grafica.getWidth(), grafica.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
		grafica.setLocation(99999999, 9999999);
	}

	
	
}
