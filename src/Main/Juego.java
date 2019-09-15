package Main;

import java.awt.EventQueue;


public class Juego extends Thread{
	
	private MapaLogico mapaLogico;
	private GUI mapaGUI;
	
	

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
		this.mapaGUI = new GUI();
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
			mapaLogico.Mover();
		}
	}

}
