package Entidades.Objetos.Magias.AumentarFuerza;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.Visitante;

public class MagiaAtaque extends Magia {

	public MagiaAtaque(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	public void recibirGolpe(int d) {
	}

	@Override
	public void setCampeon(Campeon camp) {
		// TODO Auto-generated method stub
		
	}
	
}
