package Main;

import java.awt.EventQueue;


public class Juego extends Thread{
	
	private MapaLogico mapaLogico;
	private MapaGUI mapaGUI;
	private Tienda tienda;
	private Jugador jugador;
	
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					Juego juego = new Juego();					
				}
		}
		);
	}
	
	public Juego() {
		this.mapaLogico = new MapaLogico();
		this.jugador = new Jugador(20);
		this.tienda = new Tienda(mapaLogico, jugador);
		this.mapaGUI = new MapaGUI(mapaLogico, tienda, jugador);
		mapaGUI.setVisible(true);
		
		this.start();
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mapaLogico.actualizar();
		}
	}

}
