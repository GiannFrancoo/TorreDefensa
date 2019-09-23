package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

import Entidades.Campeones.Aliados.Lazaro;

public class MapaGUI extends JFrame {

	private MapaLogico mapaLogico;
	private Tienda tienda;
	private Jugador jugador;
	private JLayeredPane panel;
	private ClickeablePanel contentPane;
	private JLabel lblCantMonedas;
//	private JPanel monedas;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MapaGUI frame = new MapaGUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MapaGUI(MapaLogico mapaLogico, Tienda tienda, Jugador jugador) {
		
		this.mapaLogico = mapaLogico;
		this.tienda = tienda;
		this.jugador = jugador;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1130, 710);
		this.setResizable(false);
		contentPane = new ClickeablePanel(mapaLogico);
		contentPane.setSize(this.getSize());
		contentPane.setOpaque(false);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		panel = new JLayeredPane();
		panel.setSize(contentPane.getSize());
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblFondo = new JLabel();
		lblFondo.setSize(panel.getSize());
		lblFondo.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/fondo_nivel1.png")).getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(lblFondo, 1, 0); 
		
		inicializarTienda();
		
		JLabel lblMonedas = new JLabel();
		lblMonedas.setBounds(1000, 560, 51, 29);
		lblMonedas.setOpaque(false);
		lblMonedas.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Aliados/coin1.png")).getImage().getScaledInstance(lblMonedas.getWidth(), lblMonedas.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(lblMonedas, 10, 2);
		
		lblCantMonedas = new JLabel();
		lblCantMonedas.setBounds(1053, 560, 60, 29);
		lblCantMonedas.setOpaque(true);
		panel.add(lblCantMonedas, 10, 2);
		
		actualizarMonedas(jugador.getMonedas());
		
//		Coordenadas de la grilla (229, 40, 848, 490);
//		Cooredenadas de una celda (241, 45, 75, 75);
		
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
		lblObj1.setBounds(12, 563, 90, 90);
		panel.add(lblObj1, 10, 2);
		lblObj1.setIcon(new ImageIcon(new ImageIcon(this.getClass().getClassLoader().getResource("texturas/Aliados/Lazaro/lazaro_tienda.png")).getImage().getScaledInstance(lblObj1.getWidth(), lblObj1.getHeight(), Image.SCALE_SMOOTH)));
		lblObj1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tienda.comprar(0);
            	actualizarMonedas(jugador.getMonedas());
            	
            }
        });
		
		JLabel lblObj2 = new JLabel();
		lblObj2.setOpaque(true);
		lblObj2.setBackground(Color.ORANGE);
		lblObj2.setBounds(107, 563, 90, 90);
		panel.add(lblObj2, 10, 2);
		
		JLabel lblObj3 = new JLabel();
		lblObj3.setOpaque(true);
		lblObj3.setBackground(Color.ORANGE);
		lblObj3.setBounds(202, 563, 90, 90);
		panel.add(lblObj3, 10, 2);
		
		JLabel lblObj4 = new JLabel();
		lblObj4.setOpaque(true);
		lblObj4.setBackground(Color.ORANGE);
		lblObj4.setBounds(297, 563, 90, 90);
		panel.add(lblObj4, 10, 2);
		
		JLabel lblObj5 = new JLabel();
		lblObj5.setOpaque(true);
		lblObj5.setBackground(Color.ORANGE);
		lblObj5.setBounds(392, 563, 90, 90);
		panel.add(lblObj5, 10, 2);
		
		JLabel lblObj6 = new JLabel();
		lblObj6.setOpaque(true);
		lblObj6.setBackground(Color.ORANGE);
		lblObj6.setBounds(487, 563, 90, 90);
		panel.add(lblObj6, 10, 2);
		
		JLabel lblObj7 = new JLabel();
		lblObj7.setOpaque(true);
		lblObj7.setBackground(Color.ORANGE);
		lblObj7.setBounds(582, 563, 90, 90);
		panel.add(lblObj7, 10, 2);
	}
	
	public void insertar(JLabel lbl) {
		panel.add(lbl);
	}
	
	public void remover(JLabel lbl) {
		panel.remove(lbl);
	}
	
	public void actualizarEntidad(JLabel lbl, int x, int y) {
		
	}
	
	public void actualizarMonedas(int m) {
		lblCantMonedas.setText("" + m);
	}
	
	
}
