package Entidades.Campeones.Aliados.Lazaro;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Objetos.Magias.Magia;
import Entidades.Objetos.Magias.Escudos.DuracionEscudo;
import Main.MapaLogico;
import Main.Animaciones.LagrimaNormal;

public class Lazaro extends Aliado {
		
	protected LazaroGrafico lazaroGrafico;
	
	public Lazaro(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.vidaMaxima = 100;
		this.vidaActual = this.vidaMaxima;
		this.ancho = 67; 
		this.alto = 80;
		this.fuerza = 20;
		this.rango = 550;		
		this.dps = 45;
		this.monedas = 50;
		

		lazaroGrafico = new LazaroGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	// Dispara a rango;
	public void golpearRango() {	
		this.dpsTiming = dps;
		DisparoLazaro d = new DisparoLazaro(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
//		lazaroGrafico.golpear();
	}

	// Se agrega una magia a la lista;
//	public void agregarMagia(Magia m) {
//		this.magias.addLast(m);
//		
//		//Empieza a hacer efecto
//		
//		DuracionEscudo de = new DuracionEscudo(mapaLogico, this);
//		de.start();
//		
//	}

}
