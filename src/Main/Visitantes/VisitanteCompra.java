package Main.Visitantes;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Campeones.Enemigos.Enemigo;
import Entidades.Disparos.Disparo;
import Entidades.EventosAleatorios.EATiempo.EventoAleatorioTiempo;
import Entidades.EventosAleatorios.EAVida.EventoAleatorioVida;
import Entidades.Objetos.Consumibles.Consumible;
import Entidades.Objetos.Magias.Magia;
import Main.Tienda.Tienda;

public class VisitanteCompra implements Visitante{
	protected Tienda tienda;
	
	public VisitanteCompra(Tienda t) {
		this.tienda = t;
	}
	
	public void visita(Enemigo e) {
		tienda.setCompraValida(false);
	}

	
	public void visita(Aliado a) {
		tienda.setCompraValida(false);
	}

	
	public void visita(Consumible c) {
		//Aqui no se hace nada.
	}

	
	public void visita(Disparo d) {
		//Aqui no se hace nada.
	}

	
	public void visita(Magia m) {
		//Aqui no se hace nada.
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
