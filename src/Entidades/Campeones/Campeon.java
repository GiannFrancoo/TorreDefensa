package Entidades.Campeones;
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
	}
	
	protected void restarVida(DisparoEnemigo d) {
		
	}
	
	protected void restarVida(DisparoAliado d) {
		System.out.println("Camepon:: restar vida, cambia grafica");
		vida = vida - d.getFuerza();
		this.cambiarGrafica(2); // Sufriendo;
	}
	
	protected void cambiarGrafica(int i) {
		System.out.println("Campeon:: cambio grafica 0, cambia grafica");
		this.grafica.setIcon(imagenes[i]);
	}
	
	public abstract void agregarMagia(Magia m);
	
}
