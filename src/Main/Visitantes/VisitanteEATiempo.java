package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EventoAleatorioVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;

public class VisitanteEATiempo implements Visitante{
	protected EventoAleatorioTiempo EATiempo;
	
	public VisitanteEATiempo(EventoAleatorioTiempo e) {
		this.EATiempo = e;
		
	}
	
	public void visita(Enemigo e) {
		e.recibirGolpe(this.EATiempo.getFuerza());
	}

	
	public void visita(Aliado a) {
		
	}

	
	public void visita(Consumible c) {
	}

	
	public void visita(Disparo d) {
	}

	
	public void visita(Magia m) {
	}

	
	public void visita(EventoAleatorioVida e) {
	}

	
	public void visita(EventoAleatorioTiempo e) {
	}


}
