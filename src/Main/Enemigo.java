package Main;

public abstract class Enemigo extends Campeon{

	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;
	
	protected int velocidad;
	protected int cantMonedas;
	

	public void mover(){
		//Mueve para la derecha;
		this.columna = this.columna - velocidad;
		cambiarGrafica(3); //Corriendo;
	}
	
	public abstract DisparoEnemigo disparar();
	
	
}
