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
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import Entidades.Campeones.Aliados.Lazaro;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class GUI extends JFrame {

	private JLayeredPane contentPane;
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
		setSize(1280, 720);
		this.setResizable(false);
		contentPane = new JLayeredPane();
		contentPane.setSize(this.getSize());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JLabel lblFondo = new JLabel();
		lblFondo.setBounds(new Rectangle(1280, 720));
		lblFondo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")).getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		
		contentPane.add(lblFondo, 1, 0); 
		inicializarTienda();
		inicializarGrilla();
		
		JTable grilla = new JTable(6, 10);
		grilla.setOpaque(true);
		grilla.setBackground(Color.BLUE);
		grilla.setBounds(200, 45, 900, 490);
		contentPane.add(grilla, 10, 2);
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 10; j++) {
				JLabel lbl = new JLabel();
				
			}
		}
		
	}
		
	public void inicializarTienda() {
		
//		JLabel fondoTienda = new JLabel();
//		fondoTienda.setOpaque(true);
//		fondoTienda.setBackground(Color.CYAN);
//		fondoTienda.setBounds(7, 588, 1266, 100);
//		contentPane.add(fondoTienda, 5, 1);
		
		JLabel lblObj1 = new JLabel();
		lblObj1.setOpaque(true);
		lblObj1.setBackground(Color.ORANGE);
		lblObj1.setBounds(12, 593, 90, 90);
		contentPane.add(lblObj1, 10, 2);
		
		JLabel lblObj2 = new JLabel();
		lblObj2.setOpaque(true);
		lblObj2.setBackground(Color.ORANGE);
		lblObj2.setBounds(107, 593, 90, 90);
		contentPane.add(lblObj2, 10, 2);
		
		JLabel lblObj3 = new JLabel();
		lblObj3.setOpaque(true);
		lblObj3.setBackground(Color.ORANGE);
		lblObj3.setBounds(202, 593, 90, 90);
		contentPane.add(lblObj3, 10, 2);
		
		JLabel lblObj4 = new JLabel();
		lblObj4.setOpaque(true);
		lblObj4.setBackground(Color.ORANGE);
		lblObj4.setBounds(297, 593, 90, 90);
		contentPane.add(lblObj4, 10, 2);
		
		JLabel lblObj5 = new JLabel();
		lblObj5.setOpaque(true);
		lblObj5.setBackground(Color.ORANGE);
		lblObj5.setBounds(392, 593, 90, 90);
		contentPane.add(lblObj5, 10, 2);
		
		JLabel lblObj6 = new JLabel();
		lblObj6.setOpaque(true);
		lblObj6.setBackground(Color.ORANGE);
		lblObj6.setBounds(487, 593, 90, 90);
		contentPane.add(lblObj6, 10, 2);
		
		JLabel lblObj7 = new JLabel();
		lblObj7.setOpaque(true);
		lblObj7.setBackground(Color.ORANGE);
		lblObj7.setBounds(582, 593, 90, 90);
		contentPane.add(lblObj7, 10, 2);
	}
	
	public void inicializarGrilla() {
		
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos02 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos03 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos04 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos05 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos06 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//		JLabel pos07 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos08 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos09 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos010 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos10 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos11 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos12 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos13 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos14 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos15 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos16 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos17 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos18 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos19 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos110 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos20 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos21 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos22 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos23 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos24 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos25 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos26 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos27 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos28 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos29 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos210 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//
//
//		JLabel pos00 = new JLabel();
//		pos00.setOpaque(true);
//		pos00.setBackground(Color.ORANGE);
//		pos00.setBounds(582, 593, 90, 90);
//		contentPane.add(pos00, 10, 2);
//



	}
	
}
