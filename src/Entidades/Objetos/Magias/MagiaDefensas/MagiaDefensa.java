package Entidades.Objetos.Magias.MagiaDefensas;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;
import Utilidad.Lista.Position;

public class MagiaDefensa extends Magia {

	public MagiaDefensa(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

	@Override
	public void recibirGolpe(int d) {
		// TODO Auto-generated method stub
		
	}

}
