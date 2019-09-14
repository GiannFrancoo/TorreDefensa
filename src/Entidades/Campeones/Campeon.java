package Entidades.Campeones;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;

import Entidades.Entidad;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Disparos.Enemigos.DisparoEnemigo;
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
		magias = new LinkedList<Magia>();
	}
	
	public abstract void restarVida(DisparoEnemigo d);
	
	public abstract void restarVida(DisparoAliado d);
	
	public abstract void agregarMagia(Magia m);

	protected void cambiarGrafica(int i) {
		//System.out.println("Campeon:: cambia grafica" + i);
		this.grafica.setIcon(imagenes[i]);
	}
	
	
}
