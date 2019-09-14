package Main;

import Entidades.Campeones.Aliados.Lazaro;

public class Game {

	public Game(GUI gui) {
	
		Lazaro laz1 = new Lazaro(gui.getContentPane().getWidth() - 30, gui.getContentPane().getHeight() - 30);
		Lazaro laz2 = new Lazaro(gui.getContentPane().getWidth() - 50, gui.getContentPane().getHeight() - 50);
		
		gui.add(laz1.getGrafica());
		gui.add(laz2.getGrafica());
		
		
	}

}
