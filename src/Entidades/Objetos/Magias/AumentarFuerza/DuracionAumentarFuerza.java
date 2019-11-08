package Entidades.Objetos.Magias.AumentarFuerza;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.EfectoMagia;
import Main.MapaLogico;
import Main.Textura;

public class DuracionAumentarFuerza extends EfectoMagia{

	protected int fuerzaAnterior;
	
	public DuracionAumentarFuerza(MapaLogico mapaLogico, Campeon camp) {
		super(mapaLogico, camp);
		
//		ImageIcon image = new ImageIcon(Textura.class.getClassLoader().getResource("texturas/escudo/efectoFuerza.gif"));
//		label.setBounds(new Rectangle(110, 110));
//		label.setIcon(new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT))); // Arranca con la imagen estatica;
//		label.setLocation(camp.getX()-16, camp.getY()-20);
	}

	@Override
	public void aplicarEfectoMagia() {
		fuerzaAnterior = camp.getFueza();
		camp.setFuerza(999999); // Instakillea afaerte;
	}

	@Override
	public void revertirEfectoMagia() {
		camp.setFuerza(fuerzaAnterior);
	}
}
