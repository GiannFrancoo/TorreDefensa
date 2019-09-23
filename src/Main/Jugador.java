package Main;

public class Jugador {

	private int monedas;
	
	public Jugador(int monedas) {
		this.monedas = monedas;
	}
	
	public void agregarMonedas(int n) {
		monedas+=n;
		
	}
	
	public void disminuirMonedas(int n) {
		monedas-=n;
	}
	
	public int getMonedas(){
		return monedas;
	}
	
	
}
