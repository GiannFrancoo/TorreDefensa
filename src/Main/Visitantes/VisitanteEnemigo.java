package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EAVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class VisitanteEnemigo implements Visitante{

	protected MapaLogico mapaLogico;
	
	public VisitanteEnemigo(MapaLogico mapaLogico) {
		this.mapaLogico = mapaLogico;
	}
	
	
	public void visita(Enemigo e) {
//		mapaLogico.hayEnemigos(true);
	}

	
	public void visita(Aliado a) {
	}

	
	public void visita(Consumible c) {
	}

	
	public void visita(Disparo d) {		
	}

	
	public void visita(Magia m) {
	}

	
	public void visita(EAVida e) {
		
		
	}


	public void visita(EventoAleatorioTiempo e) {
		
		
	}



}
