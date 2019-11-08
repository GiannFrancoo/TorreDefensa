package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class VisitanteMagia implements Visitante{
	
	protected MapaLogico mapaLogico;
	
	public VisitanteMagia(MapaLogico m) {
		this.mapaLogico = m;
	}
	
	public void visita(Enemigo e) {}
	
	public void visita(Aliado a) {}
	
	public void visita(Consumible c) {}
	
	public void visita(Disparo d) {}

	public void visita(Magia m) {
		this.mapaLogico.setMagia(m);
	}

	@Override
	public void visita(EAVida e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EventoAleatorioTiempo e) {
		// TODO Auto-generated method stub
		
	}

}
