package Main.Estados;

import Main.MapaLogico;

public class Terminado extends EstadoJuego{

	public Terminado(MapaLogico mapaLogico) {
		super(mapaLogico);
	}

	public void actua(int x, int y) {
		//Aca no se hace nada ya que se termino el juego.
	}

}
