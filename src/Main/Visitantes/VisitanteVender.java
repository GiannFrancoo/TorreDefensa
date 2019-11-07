package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EventoAleatorioVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Main.Tienda.Tienda;

public class VisitanteVender implements Visitante {
	
	private Tienda tienda;
	
	public VisitanteVender(Tienda tienda) {
		this.tienda = tienda;
	}

	public void visita(Enemigo e) {
	}

	public void visita(Aliado a) {
		tienda.vender(a);
		tienda.actualizarTienda();
	}

	public void visita(Consumible c) {
	}

	public void visita(Disparo d) {
	}

	public void visita(Magia m) {
	}

	@Override
	public void visita(EventoAleatorioVida e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visita(EventoAleatorioTiempo e) {
		// TODO Auto-generated method stub
		
	}

}
