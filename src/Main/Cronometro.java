package Main;

public class Cronometro extends Thread{
	
	protected int tiempo;
	
	public Cronometro(int tiempo) {
		
		this.tiempo = tiempo;
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		
		try {
			Thread.sleep(this.tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.stop();

	}
}
