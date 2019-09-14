package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entidades.Campeones.Aliados.Lazaro;

import javax.swing.JLabel;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel panelGame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(new Rectangle(1280, 720));
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setSize(this.getSize());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
//		panelGame = new JPanel();
//		panelGame.setSize(contentPane.getSize());
//		contentPane.add(panelGame);		
//		panelGame.setLayout(null);
//		inicializarTienda();
		
		
		JLabel lblFondo = new JLabel();
		lblFondo.setSize(contentPane.getSize());
		lblFondo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")).getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		
		
		Lazaro laz = new Lazaro(3,4); // Coordenadas;
		laz.disparar(); // Cambia disparando;
		JLabel lblLazaro = laz.getGrafica(); // Seteo el label;
		lblLazaro.setSize(contentPane.getSize());
		
		
		//OTRA OPCION
//		BufferedImage img = null;
//		try {
//		    img = ImageIO.read(new File(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png").getPath()));
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}
//		Image dimg = img.getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH);
//		ImageIcon imageIcon = new ImageIcon(dimg);
//		lblFondo.setIcon(imageIcon);
		
		contentPane.add(lblLazaro);
		contentPane.add(lblFondo);
		
	}
		
	public void inicializarTienda() {
		JPanel panelTienda = new JPanel();
		panelTienda.setBackground(Color.ORANGE);
		panelTienda.setBounds(12, 519, 1256, 169);
		panelGame.add(panelTienda);
		panelTienda.setLayout(null);
		
		JLabel lblObj1 = new JLabel("Obj1");
		lblObj1.setBackground(Color.ORANGE);
		lblObj1.setBounds(12, 12, 145, 145);
		panelTienda.add(lblObj1);
		
		JLabel lblObj2 = new JLabel("Obj2");
		lblObj2.setBackground(Color.ORANGE);
		lblObj2.setBounds(169, 12, 145, 145);
		panelTienda.add(lblObj2);
		
		JLabel lblObj3 = new JLabel("Obj3");
		lblObj3.setBackground(Color.ORANGE);
		lblObj3.setBounds(326, 12, 145, 145);
		panelTienda.add(lblObj3);
		
		JLabel lblObj4 = new JLabel("Obj4");
		lblObj4.setBackground(Color.ORANGE);
		lblObj4.setBounds(483, 12, 145, 145);
		panelTienda.add(lblObj4);
		
		JLabel lblObj5 = new JLabel("Obj5");
		lblObj5.setBackground(Color.ORANGE);
		lblObj5.setBounds(640, 12, 145, 145);
		panelTienda.add(lblObj5);
		
		JLabel lblObj6 = new JLabel("Obj6");
		lblObj6.setBackground(Color.ORANGE);
		lblObj6.setBounds(797, 12, 145, 145);
		panelTienda.add(lblObj6);
		
		JLabel lblObj7 = new JLabel("Obj7");
		lblObj7.setBackground(Color.ORANGE);
		lblObj7.setBounds(954, 12, 145, 145);
		panelTienda.add(lblObj7);
	}
}
