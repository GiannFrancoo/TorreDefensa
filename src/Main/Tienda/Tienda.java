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
	private boolean compraValida;
	
	public Tienda(MapaLogico mapaLogico, Jugador jugador) {
		this.mapaLogico = mapaLogico;
		
		tiendaGrafica = new TiendaGrafica(mapaLogico, this);
		tiendaGrafica.actualizarMonedas(jugador.getMonedas());
		actualizarTienda();
		compraValida = true;
	}
	
	public void comprar(Entidad entidadComprada) {
		this.setComprado(entidadComprada);
    	mapaLogico.setEstado(new Comprando(mapaLogico));
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
	
	public void setCompraValida(boolean valido) {//Setea si donde clickeo el usuario es un lugar valido o no.
		this.compraValida = valido;
	}
	
	public boolean getCompraValida() {//Devuelvo si donde clickeo es un lugar valido o no.
		return this.compraValida;
	}
	
	
	//public Tienda() {}
	//public Entidad comprar(int n);
	//public void vender(Aliado a);
	//public void vender(Objeto o);

}
