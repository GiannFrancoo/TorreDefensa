package Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class MapaGui extends JFrame {
	
	//Atrubutos
	protected Container contenPane;
	protected JPanel gamePanel;
	protected JLabel lvlBackground;

	public MapaGui() { 
	   super("TorreDefensa"); 
	   setBounds(new Rectangle(1366, 768));
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container contenPane = this.getContentPane();
	   setVisible(true);
	   gamePanel = new JPanel();
	   gamePanel.setLayout(new FlowLayout());
	   gamePanel.setSize(contenPane.getSize());
	   contenPane.add(gamePanel);
	   dibujarPanelDeJuego(1);
	   
	}
	
	public void dibujarPanelDeJuego(int nivel) {
		ImageIcon fondoNivel = new ImageIcon(this.getClass().getResource("/texturas/nivel1.png"));
		lvlBackground.setIcon(fondoNivel);
		lvlBackground.setSize(contenPane.getSize());
		contenPane.add(lvlBackground);
//		System.out.println("Ruta del archivo: " + this.getClass().getResource("/texturas/nivel1.png").getPath());
		
	}

}
