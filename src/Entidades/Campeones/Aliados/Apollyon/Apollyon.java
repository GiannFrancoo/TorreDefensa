package Entidades.Campeones.Aliados.Apollyon;

import Entidades.Campeones.Aliados.Aliado;
import Entidades.Disparos.Disparo;
import Entidades.Disparos.Aliados.DisparoAliado;
import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Visitantes.VisitanteBooleano;

public class Apollyon extends Aliado {
	
	protected ApollyonGrafico apollyonGrafico;
	
	public Apollyon(MapaLogico m) {
		super(m);
		
		this.ancho = 75;
		this.alto = 75;
		this.vida = 100;
		this.fuerza = 15;
		this.rango = 5;		
		this.monedas = 100;
		

		ApollyonGrafico apollyonGrafico= new ApollyonGrafico(this, ancho, alto);
		entidadGrafica = apollyonGrafico;
	}

	@Override
	public DisparoAliado disparar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarMagia(Magia m) {
		// TODO Auto-generated method stub

	}

	public boolean visitadoBooleano(VisitanteBooleano a) {
		return a.visita(this);
				
	}

}
