package Main;

import Entidades.Entidad;
import Utilidad.Pair;

public abstract class EstadoJuego {
	protected MapaLogico m;
	protected Entidad e;
	protected Comprando comprando;
	protected Jugando jugando;
	protected Vendiendo vendiendo;
	
	public abstract void actua(int x, int y, MapaLogico m);
	public abstract void comprar(int codigo, Pair<Integer,Integer>[]arreglo, Jugador jugador, Entidad comprado);
	public abstract void vender();
	
}
