package Entidades.Objetos.Magias.Escudos;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;


//Por ahora no se usa, si las magias funcionan esta clase es innecesaria.
public class MagiaDefensa extends Magia {

	public MagiaDefensa(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

	public void recibirGolpe(int d) {
	}

	@Override
	public void setCampeon(Campeon camp) {
		// TODO Auto-generated method stub
		
	}

}
