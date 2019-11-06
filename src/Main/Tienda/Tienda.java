package Main.Tienda;


import Entidades.Entidad;
import Entidades.Campeones.Aliados.Aliado;
import Main.Jugador;
import Main.MapaLogico;
import Main.Estados.Comprando;

public class Tienda {
	
	private MapaLogico mapaLogico;
	private Entidad comprado;
	private TiendaGrafica tiendaGrafica;
	
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		
		tiendaGrafica = new TiendaGrafica(mapaLogico, this);
		tiendaGrafica.actualizarMonedas(jugador.getMonedas());
		actualizarTienda();
	}
	
	public void comprar(Entidad entidadComprada) {
    	mapaLogico.setEstado(new Comprando(mapaLogico));
    	//this.setComprado(entidadComprada);
	}
	
	public void vender(Aliado a) {
		if (a.getVidaActual() == a.getVidaMaxima()) {
			this.mapaLogico.getJugador().agregarMonedas(a.getMonedas());
		} else {
			this.mapaLogico.getJugador().agregarMonedas(a.getMonedas()/2);
		}
		tiendaGrafica.actualizarMonedas(this.mapaLogico.getJugador().getMonedas());
		mapaLogico.eliminar(a.getPosEnLista());
	}
	
	
	public Entidad getComprado() {
		return this.comprado;
	}
	
	public void setComprado(Entidad e) {
		this.comprado = e;
	}
	
	public TiendaGrafica getGrafica() {
		return tiendaGrafica;
	}
	
	public void actualizarTienda() {
		tiendaGrafica.actualizarTienda(this.mapaLogico.getJugador().getMonedas());
	}
	
	public void actualizarMonedas() {
		this.tiendaGrafica.actualizarMonedas(this.mapaLogico.getJugador().getMonedas());
	}
	
	
	
	//public Tienda() {}
	//public Entidad comprar(int n);
	//public void vender(Aliado a);
	//public void vender(Objeto o);

}
