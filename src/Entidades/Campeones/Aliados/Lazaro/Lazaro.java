package Entidades.Campeones.Aliados.Lazaro;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;

public class Lazaro extends Aliado {
		
	protected LazaroGrafico lazaroGrafico;
	
	public Lazaro(MapaLogico mapaLogico){
		super(mapaLogico);
		
		this.ancho = 67; 
		this.alto = 80;
		this.vidaActual = 100;
		this.fuerza = 25;
		this.rango = 550;		
		this.dps = 35;
		monedas = 100;
		

		lazaroGrafico = new LazaroGrafico(mapaLogico, this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	// Dispara a rango;
	public void golpearRango() {	
		//Aplicar magia
		DisparoLazaro d = new DisparoLazaro(x, y, this.fuerza, this.rango, mapaLogico);
		mapaLogico.insertar(d);
		d.setX(this.x);
		d.setY(this.y);
//		lazaroGrafico.golpear();
	}

	// Se agrega una magia a la lista;
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}

}
