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
	
	public void restarVida(Disparo d) {
		vida = vida - d.getFuerza();
		cambiarGrafica(2); // Sufriendo
	}
	
	public void cambiarGrafica(int i) {
		grafica = new JLabel(imagenes[i]);	
	}
	
}
