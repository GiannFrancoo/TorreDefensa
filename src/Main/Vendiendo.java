package Main;

public class Vendiendo extends EstadoJuego{

	
	public void actua(MapaLogico m, int x, int y) {
		m.eliminar(x, y);
		m.setEstado(new Jugando());
	}


	
}
