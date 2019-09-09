package Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MapaGui extends JFrame {
	
	//Atrubutos
	protected Container contenPane;
	protected JPanel panelPrincipal;
	protected JLabel fondoNivel;

	public MapaGui() { 
	   super("TorreDefensa"); 
	   setBounds(new Rectangle(1366, 768));
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container contenPane = this.getContentPane();
	   setVisible(true);
	   panelPrincipal = new JPanel();
	   contenPane.add(panelPrincipal);
	   cargarNivel(1);
	   
	}
	
	public void cargarNivel(int nivel) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Recursos/nivel1.png"));
		Image fondo = icon.getImage();
		fondoNivel = new JLabel();
		fondoNivel.setIcon(icon);
		panelPrincipal.add(fondoNivel);
		fondoNivel.setVisible(true);
		
	}

	public static void main(String[] args) {
		new MapaGui();
	}

}
