package Main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import Main.Tienda.Tienda;

public class ClickeablePanel extends JPanel implements MouseListener, MouseMotionListener {

	private MapaLogico mapaLogico;
	private Tienda tienda;
    
    public ClickeablePanel(MapaLogico mapaLogico, Tienda tienda) {
    	
    	this.mapaLogico = mapaLogico;
    	this.tienda = tienda;
    	this.addMouseListener(this);
    	this.addMouseMotionListener(this);
    	
	}
    
    @Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		//Si las coordenadas del click estan dentro de la grilla -> then
		if (((arg0.getX() > 233) && (arg0.getX() < (233 + 841))) && ((arg0.getY() > 42) && (arg0.getY() < (42 + 487)))) {
//			int x = (((arg0.getX() - 233) * 10)/ 841);
//			int y = (((arg0.getY() - 42) * 6)/ 487);
			mapaLogico.accionar(arg0.getX(), arg0.getY());
		}	

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
				
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}

}
