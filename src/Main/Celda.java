package Main;

import javax.swing.*;

public class Celda extends JButton {
	
	protected int x;
	protected int y;
	
	public Celda() {
		super();
	}
	
	public Celda(String msg) {
		super(msg);
	}
	
	public int obtenerX() {
		return x;
	}
	
	public int obtenerY() {
		return y;
	}
	
	public void setearX(int x) {
		this.x = x;
	}
	
	public void setearY(int y) {
		this.y = y;
	}
	
}
