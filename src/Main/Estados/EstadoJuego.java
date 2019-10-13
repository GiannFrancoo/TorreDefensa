package Main.Estados;

import Main.MapaLogico;

public abstract class EstadoJuego {

	public abstract void actua(MapaLogico m, int x, int y);
}
