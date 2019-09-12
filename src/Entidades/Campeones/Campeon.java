package Entidades.Campeones;
import java.util.List;

import javax.swing.JLabel;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Objetos.Magias.Magia;

public abstract class Campeon extends Entidad{
	//fila 	  --> Entidad;
	//columna --> Entidad;
	//grafica ---> Entidad;
	
	
	protected int vida;
	protected int fuerza;
	protected int rango;
	protected List<Magia> magias;
	
	public Campeon(int x,int y) {
		super(x,y); // Entidad;
	}
	
	public void restarVida(Disparo d) {
		System.out.println("Camepon:: restar vida, cambia grafica");
		vida = vida - d.getFuerza();
		this.cambiarGrafica(2); // Sufriendo;
	}
	
	public void cambiarGrafica(int i) {
		System.out.println("Campeon:: cambio grafica 0, cambia grafica");
		this.grafica.setIcon(imagenes[i]);
	}
	
}
