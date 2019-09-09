package Main;

public class Jugador {

	protected int monedas;
	
	public Jugador(int monedas) {
		this.monedas = monedas;
	}
	
	public void agregarMonedas(int n) {
		monedas+=n;
	}
	
	public int getMonedas(){
		return monedas;
	}
	
	
}
