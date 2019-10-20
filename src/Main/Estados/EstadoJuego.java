package Main.Estados;

import Main.MapaLogico;

public abstract class EstadoJuego {
	
	protected MapaLogico mapaLogico;
	
	public EstadoJuego(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}

	public abstract void actua(int x, int y);
}
