package Entidades.Objetos.Magias.MagiaDefensas;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Entidades.Objetos.Magias.Magia;
import Main.MapaLogico;
import Main.Textura;
import Main.Visitantes.Visitante;

public class MagiaDefensa extends Magia {

	public MagiaDefensa(int x, int y, MapaLogico m) {
		super(x, y, m);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Visitante a) {
		if (this.estaVivo) {
			a.visita(this);
		}
	}

	public void recibirGolpe(int d) {
	}

}
