package Main;

import java.awt.EventQueue;
import java.util.Random;

import Entidades.Campeones.Enemigos.Colmena.Colmena;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.MagiaDefensas.MagiaDefensa;
import Entidades.Objetos.Magias.MagiaDefensas.MagiaEscudo;



public class Juego extends Thread{
	
	private MapaLogico mapaLogico;
	private boolean b = true;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					new Juego();					
				}
		}
		);
	}
	
	public Juego() {
		this.mapaLogico = new MapaLogico();
//		Sonido.BACK_LVL1.loop();
		
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
			
			if (b) {
				Magia md = new MagiaEscudo(9,9,mapaLogico);
				md.setX(((9 * 841) / 10 ) + 233);
				md.setY(((4 * 487) / 6) + 42 );
				mapaLogico.insertar(md);
				b = false;
			}
			
			
			
			Random r = new Random();
			if (r.nextInt(70) == 0) {
				
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
			
			
//			if(r.nextInt(50) == 0) {
//				Magia md = new MagiaEscudo(9,9,mapaLogico);
//					
//				md.setX(((9 * 841) / 10 ) + 233);
//				md.setY(((4 * 487) / 6) + 42 );
//				
//				mapaLogico.insertar(md);
//			}
			
		}
	}
}
