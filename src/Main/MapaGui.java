package Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class MapaGui extends JFrame {
	
	//Atrubutos
	protected JPanel gamePanel;

	public MapaGui() { 
		super("TorreDefensa"); 
		setBounds(new Rectangle(1366, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//PRUEBA 1 (INCLUYE LA CLASE DE ABAJO)
		gamePanel = new fondoNivel();
		//////////////////////////////////////
		//PRUEBA 2 (INCLUYE METODO DE ABAJO)
//		gamePanel = new JPanel();
		//////////////////////////////////////
		setContentPane(gamePanel) ;
//		dibujarPanelDeJuego(1);
		this.repaint();
	}
	//PRUEBA 2
//	public void dibujarPanelDeJuego(int nivel) {
//		ImageIcon fondo = new ImageIcon(MapaGui.class.getClassLoader().getResource("texturas/fondo_nivel1.png"));
//		fondoNivel = new JLabel(fondo);
////		fondoNivel.setSize(gamePanel.getSize());
//		gamePanel.add(fondoNivel);
//		fondoNivel.setVisible(true);
////		System.out.println("Ruta: " + MapaGui.class.getClassLoader().getResource("texturas/fondo_nivel1.png"));
		
//	}
	/////////////////////////////
	
	class fondoNivel extends JPanel {
	  Image image;
	  public fondoNivel()
	  {
	    try
	    {
	      image = javax.imageio.ImageIO.read(new java.net.URL(MapaGui.class.getClassLoader().getResource("texturas/fondo_nivel1.png"),"fondoNivel"));
	    }
	    catch (Exception e) { /*handled in paintComponent()*/ }
	  }
	 
	  @Override
	  protected void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);
	    if (image != null)
	      g.drawImage(image, 0,0,this.getWidth(),this.getHeight(),this);
	  }
	}

}
