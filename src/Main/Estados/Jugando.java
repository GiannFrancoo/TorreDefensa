package Main.Estados;

import Main.MapaLogico;

public class Jugando extends EstadoJuego{
	
	public Jugando(MapaLogico mapaLogico) {
		super(mapaLogico);
	}
	
	public void actua(int x, int y) {
		//Aca no se hace nada ya que mientras se esta jugando no hay interaccion con la tienda
		//ni la grilla.
		
	}

}
