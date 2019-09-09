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
	   dibujarPanelDeJuego(1);
	   contenPane.add(gamePanel);
	   
	}
	
	public void dibujarPanelDeJuego(int nivel) {
		ImageIcon fondoNivel = new ImageIcon(this.getClass().getResource("/Texturas/nivel1.png"));
		lvlBackground.setIcon(fondoNivel);
		gamePanel.add(lvlBackground);
		lvlBackground.setVisible(true);
		
	}

	public static void main(String[] args) {
		new MapaGui();
	}

}
