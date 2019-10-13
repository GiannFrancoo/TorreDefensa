package Entidades.Campeones.Aliados.Lazaro;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;

public class Lazaro extends Aliado{
		
	protected LazaroGrafico lazaroGrafico;
	
	public Lazaro(MapaLogico m){
		super(m);
		
		this.ancho = 63; //75
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		LazaroGrafico lazaroGrafico= new LazaroGrafico(this, ancho, alto);
		entidadGrafica = lazaroGrafico;
	}

	@Override
	public DisparoAliado disparar() {
		//Se recorre la lista de magias, y por cada magia de ataque se incrementa fuerza;
		//Si hay magia se afecta + fuerza;
		
		int n = 0;
		DisparoAliado d = new DisparoAliado(x, y, n, mapaLogico);
		
		
		lazaroGrafico.disparar();
	
		return d;
	}

	
	public void agregarMagia(Magia m) {
		this.magias.add(m);
	}
	
	// Sujeto a cmabio;
	public void recibirGolpe(int d) {
		//Parte logica de restar vida;
		lazaroGrafico.restarVida();
	}

	// Para las colisiones;
	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
	}

	

}
