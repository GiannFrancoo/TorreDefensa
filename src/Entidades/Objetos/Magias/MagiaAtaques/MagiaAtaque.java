package Entidades.Objetos.Magias.MagiaAtaques;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;
import Utilidad.Lista.Position;

public class MagiaAtaque extends Magia {

	public MagiaAtaque(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void visitado(VisitanteDisparo v) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void setPosEnLista(Position<Entidad> pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Position<Entidad> getPosEnLista() {
		// TODO Auto-generated method stub
		return null;
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
