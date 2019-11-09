package Entidades.Objetos.Magias.AumentarFuerza;

import Entidades.Campeones.Campeon;
import Entidades.Objetos.Magias.EfectoMagia;
import Main.MapaLogico;

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
