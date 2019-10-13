package Main;

import java.awt.EventQueue;
import java.util.Random;

import Entidades.Campeones.Enemigos.Colmena.Colmena;


public class Juego extends Thread{
	
	private MapaLogico mapaLogico;

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
		this.start();
	}
	
	public void run() {
		while(true){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mapaLogico.actualizar();
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			Random r = new Random();
			if (r.nextInt(100) == 0) {
				
				Colmena e = new Colmena(mapaLogico);
				int y = r.nextInt(6);
				switch (y) {
				
					case (0):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
					
					case (1):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
					
					case (2):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
					
					case (3):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
					
					case (4):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
					
					case (5):{
						e.setX(((9 * 841) / 10 ) + 233);
						e.setY(((y * 487) / 6) + 42 );
						break;
					}
				}
				mapaLogico.insertar(e);

			}
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
		}
	}

}
