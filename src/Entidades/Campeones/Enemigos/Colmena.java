package Entidades.Campeones.Enemigos;

import java.util.LinkedList;
import javax.swing.ImageIcon;

import Entidades.Disparos.Enemigos.DisparoEnemigo;
import Entidades.Objetos.Magias.Magia;

public class Colmena extends Enemigo {

	
	//fila    --> Entidad;
	//columna --> Entidad;
	//vida	  --> Campeon;
	//fuerza  --> Campeon;
	//rango   --> Campeon;
	//magias  --> Campeon;

	//velocidad --> Enemigo;
	//cantMonedas --> Enemigo;
	
	public Colmena() {
		this.velocidad = 4;
		this.vida = 100;
		this.fuerza = 100;
		this.rango = 3;
		this.cantMonedas = 30; // Random puede ser;
		
		magias = new LinkedList<Magia>();
		
		
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/BattleCity/up.png")); // Estatico;
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/BattleCity/down.png")); // Disparando;
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/BattleCity/left.png")); // Sufriendo;
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/BattleCity/right.png")); // Corriendo;
	}

	@Override
	public DisparoEnemigo disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		int n = 0;
		
		DisparoEnemigo d = new DisparoEnemigo(n);
		
		
		//Grafica
		cambiarGrafica(1); //Disparando
	
		return d;
	}
	
	
}
