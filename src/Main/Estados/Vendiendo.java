package Main.Estados;


import Main.MapaLogico;

public class Vendiendo extends EstadoJuego{

	
	public void actua(MapaLogico m, int x, int y) {
		//LLAMAR A VISITOR DE ALIADOS Y BARRICADAS
		m.eliminarPosta(new Position(x, y));
		m.setEstado(new Jugando());
	}


	
}
