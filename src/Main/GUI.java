package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class GUI extends JFrame {

	private JPanel contentPane;

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
		setBounds(new Rectangle(1366, 768));
		contentPane = new JPanel();
		contentPane.setSize(this.getSize());
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		JPanel panelJuego = new JPanel();
//		panelJuego.setBounds(12, 12, 426, 251);
//		contentPane.add(panelJuego);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setSize(contentPane.getSize());
//		lblFondo.setBounds(12, 0, 426, 263);
		lblFondo.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")));
		contentPane.add(lblFondo);
//		System.out.println(GUI.class.getClassLoader().getResource("texturas/fondo_nivel1.png"));
		
	}
}
