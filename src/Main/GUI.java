package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends JFrame {

	private JLayeredPane contentPane;

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
		setSize(1130, 710);
		this.setResizable(false);
		contentPane = new JLayeredPane();
		contentPane.setSize(this.getSize());
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JLabel lblFondo = new JLabel();
		lblFondo.setSize(contentPane.getSize());
		lblFondo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")).getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		
		contentPane.add(lblFondo, 1, 0); 
		inicializarTienda();
		inicializarGrilla();
		
		
	}
	
	public void inicializarGrilla() {
		
		/////////////////////////////////////////////////////////////////////////////////
		JLabel prueba = new JLabel();
		prueba.setBounds(10, 10, 80, 40);
		prueba.setOpaque(true);
		prueba.setBackground(Color.MAGENTA);
		contentPane.add(prueba, 5, 3); 
		/////////////////////////////////////////////////////////////////////////////////
		
		JPanel grilla = new JPanel();
//		JLayeredPane grilla = new JLayeredPane();
		grilla.setLayout(new GridLayout(6, 10));
		contentPane.add(grilla, 5, 3);
		grilla.setOpaque(false);
//		grilla.setBackground(Color.MAGENTA);
		grilla.setBounds(229, 40, 848, 490);
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				Celda celda = new Celda(i + "-" + j);
				celda.setearX(i);
				celda.setearY(j);
				celda.setActionCommand(i + "-" + j);
				celda.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	Celda boton = (Celda) e.getSource();
		            	//Prueba de los botones
		            	prueba.setText(boton.obtenerX() + "-" + boton.obtenerY());
		            	////////////////////////////////////////////////////////////
		            }
		        });
//				celda.setBackground(Color.GREEN);
				celda.setContentAreaFilled(false);
				celda.setOpaque(false);
				celda.setBorder(null);
				celda.setBounds(241, 45, 75, 75);
				grilla.add(celda);
			}
		}
		
//		JLabel celda = new JLabel();
//		celda.setBackground(Color.GREEN);
//		celda.setOpaque(true);
//		celda.setBounds(241, 45, 75, 75);
//		contentPane.add(celda, 5, 3);
		
	}
		
	public void inicializarTienda() {
		
//		JLabel fondoTienda = new JLabel();
//		fondoTienda.setOpaque(true);
//		fondoTienda.setBackground(Color.CYAN);
//		fondoTienda.setBounds(7, 588, 1266, 100);
//		contentPane.add(fondoTienda, 5, 1);
		
		JButton lblObj1 = new JButton();
		lblObj1.setOpaque(true);
		lblObj1.setBackground(Color.ORANGE);
		lblObj1.setBounds(12, 583, 90, 90);
		contentPane.add(lblObj1, 10, 2);
		lblObj1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Aliados/lazarus_estatico.png")).getImage().getScaledInstance(lblObj1.getWidth(), lblObj1.getHeight(), Image.SCALE_SMOOTH)));
		
		JLabel lblObj2 = new JLabel();
		lblObj2.setOpaque(true);
		lblObj2.setBackground(Color.ORANGE);
		lblObj2.setBounds(107, 583, 90, 90);
		contentPane.add(lblObj2, 10, 2);
		
		JLabel lblObj3 = new JLabel();
		lblObj3.setOpaque(true);
		lblObj3.setBackground(Color.ORANGE);
		lblObj3.setBounds(202, 583, 90, 90);
		contentPane.add(lblObj3, 10, 2);
		
		JLabel lblObj4 = new JLabel();
		lblObj4.setOpaque(true);
		lblObj4.setBackground(Color.ORANGE);
		lblObj4.setBounds(297, 583, 90, 90);
		contentPane.add(lblObj4, 10, 2);
		
		JLabel lblObj5 = new JLabel();
		lblObj5.setOpaque(true);
		lblObj5.setBackground(Color.ORANGE);
		lblObj5.setBounds(392, 583, 90, 90);
		contentPane.add(lblObj5, 10, 2);
		
		JLabel lblObj6 = new JLabel();
		lblObj6.setOpaque(true);
		lblObj6.setBackground(Color.ORANGE);
		lblObj6.setBounds(487, 583, 90, 90);
		contentPane.add(lblObj6, 10, 2);
		
		JLabel lblObj7 = new JLabel();
		lblObj7.setOpaque(true);
		lblObj7.setBackground(Color.ORANGE);
		lblObj7.setBounds(582, 583, 90, 90);
		contentPane.add(lblObj7, 10, 2);
	}
	
	
}
