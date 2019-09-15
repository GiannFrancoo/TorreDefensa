package Utilidad.Lista;

public class Node<E> implements Position<E>{
	
	private E elemento;
	private Node<E> siguiente;
	

	public Node(E elem, Node<E> sig) {
		elemento = elem;
		siguiente = sig;
	}
	
	public Node(E elem) {
		this(elem, null);
	}
	
	public E getDato() {
		return elemento;
	}
	
	public void setDato(E elemento) {
		this.elemento = elemento;
	}
	
	public Node<E> getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Node<E> siguiente) {
		this.siguiente = siguiente;
	}
	
	public E element() {
		return elemento;
	}
}
