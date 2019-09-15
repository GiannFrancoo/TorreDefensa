package Utilidad.Lista;

import java.util.Iterator;

public class SimpleLinkedList<E> implements PositionList<E>{
	protected Node<E> head;
	protected int tamaño;
	
	public SimpleLinkedList() {
		head = null;
		tamaño = 0;
	}
	

	public int size() {
		return tamaño;
	}

	public boolean isEmpty() {
		return tamaño == 0;
	}

	public Position<E> first() throws EmptyListException {
		if (this.isEmpty()) {
			throw new EmptyListException("Lista vacía");
		}
		return head;
	}

	public Position<E> last() throws EmptyListException {
		if (this.isEmpty()) {
			throw new EmptyListException("Lista vacía");
		}
		Node<E> p = head;
		while(p.getSiguiente() != null) {
			p = p.getSiguiente();
		}
		return p;
	}

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		Node<E> n = checkPosition(p);
		if (n.getSiguiente() == null) {
			throw new BoundaryViolationException("Next: Siguente de último");
		}
		return n.getSiguiente();
	}
	
	private Node<E> checkPosition(Position<E> p) throws InvalidPositionException {
		try {
			if(p == null)
				throw new InvalidPositionException("Posición nula");
			return (Node<E>) p;
		} catch(ClassCastException e) {
			throw new InvalidPositionException("Posición invalida");
		}
	}

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		if (this.isEmpty()) {
			throw new InvalidPositionException("Lista vacía");
		}
		if (p == head) {
			throw new BoundaryViolationException("Prev: Anterior de primero");
		}
		Node<E> n = checkPosition(p);
		Node<E> aux = head;
		while (aux.getSiguiente() != n && aux.getSiguiente() != null) {
			aux = aux.getSiguiente();
		}
		if (aux.getSiguiente() == null) {
			throw new InvalidPositionException("La posición no pertenece a la lista");
		}
		return aux;
	}

	public void addFirst(E element) {
		head = new Node<E>(element, head);
		tamaño++;
	}

	public void addLast(E element) {
		if (this.isEmpty()) {
			this.addFirst(element);
		} else {
			Node<E> p = head;
			while (p.getSiguiente() != null) {
				p = p.getSiguiente();
			}
			p.setSiguiente(new Node<E>(element));
			tamaño++;
		}
	}

	public void addAfter(Position<E> p, E element) throws InvalidPositionException {
		Node<E> n = checkPosition(p);
		Node<E> nuevo = new Node<E>(element, n.getSiguiente());
		n.setSiguiente(nuevo);
		tamaño++;
	}

	public void addBefore(Position<E> p, E element) throws InvalidPositionException {
		Node<E> n = checkPosition(p);
		try {
			if (p == first()) {
				this.addFirst(element);
			}
			else {
				Node<E> anterior = (Node<E>) this.prev(p);
				Node<E> nuevo = new Node<E>(element, n);
				anterior.setSiguiente(nuevo);
				tamaño++;
				
			}
		} catch (EmptyListException | BoundaryViolationException e) {
			throw new InvalidPositionException("Posición invalida");
		}
	}

	public E remove(Position<E> p) throws InvalidPositionException {
		if ( this.isEmpty()) {
			throw new InvalidPositionException("Posición invalida");
		}
		Node<E> n = checkPosition(p);
		E aux = p.element();
		if (n == head) {
			head = head.getSiguiente();
		}
		else {
			Node<E> anterior;
			try {
				anterior = (Node<E>) prev(p);
				anterior.setSiguiente(n.getSiguiente());
			} catch (BoundaryViolationException e) {}
		}
		tamaño--;
		return aux;
	}

	public E set(Position<E> p, E element) throws InvalidPositionException {
		if (this.isEmpty()) {
			throw new InvalidPositionException("Lista vacía");
		}
		Node<E> n = checkPosition(p);
		E aux = n.getDato();
		n.setDato(element);
		return aux;
	}


	public Iterator<E> iterator() {
		return new Mi_Iterator<E>(this);
	}


	public Iterable<Position<E>> positions() {
		PositionList<Position<E>> iterable;
		iterable = new DoubleLinkedList<Position<E>>(); //Cambiar a DoubleLinkedList para menor tiempo de ejecución.
		Node<E> actual = head;
		while(actual != null) {
			iterable.addLast(actual);
			actual = actual.getSiguiente();
		}
		return iterable;
	}

}
