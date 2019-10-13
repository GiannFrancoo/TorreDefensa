package Entidades.Objetos.Magias.MagiaDefensas;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.VisitanteBooleano;
import Main.VisitanteDisparo;
import Main.VisitanteTienda;
import Utilidad.Lista.Position;

public class MagiaDefensa extends Magia {

	public MagiaDefensa(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
//
//	@Override
//	public void visitado(VisitanteDisparo v) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Position<Entidad> getPosEnLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosEnLista(Position<Entidad> pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

	@Override
	public boolean visitadoDisparo(VisitanteDisparo vd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recibirGolpe(int d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitaVender(VisitanteTienda vt) {
		// TODO Auto-generated method stub
		
	}

}
