package Utilidad.Lista;

import java.util.Iterator;

public class DoubleLinkedList<E> implements PositionList<E> {
	
	dNode<E> header, trailer;
	int tamaño;
	
	public DoubleLinkedList() {
		header = new dNode<E>(null, null, null);
		trailer = new dNode<E>(header, null, null);
		header.setNext(trailer);
		tamaño = 0;
	}
	
	private dNode<E> checkPosition(Position<E> p) throws InvalidPositionException {
		if (p == null) {
			throw new InvalidPositionException("Posicion Invalida (Lista vacía");
		}
		
		if (p == header) {
			throw new InvalidPositionException("La posicion del header es invalida");
		}
		
		if (p == trailer) {
			throw new InvalidPositionException("La posicion del trailer es invalida");
		}
		
		try {
			
			dNode<E> aux = (dNode<E>) p;
			if (aux.getNext() == null || aux.getPrev() == null) {
				throw new InvalidPositionException("La posicion no pertenece a una lista válida");
			}
			
			return aux;
			
		} catch (ClassCastException e) {
			throw new InvalidPositionException("La posicion es de un tipo equivocado para esta lista");
		}
		
	}
	
	public boolean isEmpty() {
		return header.getNext() == trailer;
	}
	
	public int size() {
		return tamaño;
	}

	public Position<E> first() throws EmptyListException {
		if (this.isEmpty()) {
			throw new EmptyListException("Lista vacía");
		}
		return header.getNext();
	}

	public Position<E> last() throws EmptyListException {
		if (this.isEmpty()) {
			throw new EmptyListException("Lista vacía");
		}
		return trailer.getPrev();
	}

	public Position<E> next(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		if (p == trailer.getPrev()) {
			throw new BoundaryViolationException("Posicion invalida");
		}
		dNode<E> n = checkPosition(p);
		return n.getNext();
	}

	public Position<E> prev(Position<E> p) throws InvalidPositionException, BoundaryViolationException {
		if (p == header.getNext()) {
			throw new BoundaryViolationException("Posicion invalida");
		}
		dNode<E> n = checkPosition(p);
		return n.getPrev();
	}

	public void addFirst(E element) {
		dNode<E> nuevo = new dNode<E>(header, header.getNext(), element);
		header.getNext().setPrev(nuevo);
		header.setNext(nuevo);
		tamaño++;
	}

	public void addLast(E element) {
		dNode<E> nuevo = new dNode<E>(trailer.getPrev(), trailer, element);
		trailer.getPrev().setNext(nuevo);
		trailer.setPrev(nuevo);
		tamaño++;
	}

	public void addAfter(Position<E> p, E element) throws InvalidPositionException {
		dNode<E> pos = checkPosition(p);
		dNode<E> nuevo = new dNode<E>(pos, pos.getNext(), element);
		pos.getNext().setPrev(nuevo);
		pos.setNext(nuevo);
		tamaño++;
	}

	public void addBefore(Position<E> p, E element) throws InvalidPositionException {
		dNode<E> pos = checkPosition(p);
		dNode<E> nuevo = new dNode<E>(pos.getPrev(), pos, element);
		pos.getPrev().setNext(nuevo);
		pos.setPrev(nuevo);
		tamaño++;
	}

	public E remove(Position<E> p) throws InvalidPositionException {
		if (this.isEmpty()) {
			throw new InvalidPositionException("No se puede remover elementos de una lista vacia");
		}
		dNode<E> aux = checkPosition(p);
		dNode<E> auxPrev = aux.getPrev();
		dNode<E> auxNext = aux.getNext();
		auxPrev.setNext(auxNext);
		auxNext.setPrev(auxPrev);
		E auxElem = aux.element();
		tamaño--;
		return auxElem;
	}

	public E set(Position<E> p, E element) throws InvalidPositionException {
		if (this.isEmpty()) {
			throw new InvalidPositionException("No se puede setear elementos de una lista vacia");
		}
		dNode<E> pos = checkPosition(p);
		E toReturnElem = pos.element();
		pos.setElem(element);
		return toReturnElem;
	}

	public Iterator<E> iterator() {
		return new Mi_Iterator<E>(this);
	}

	public Iterable<Position<E>> positions() {
		PositionList<Position<E>> iterable;
		iterable = new DoubleLinkedList<Position<E>>();
		if (!this.isEmpty()) {
			dNode<E> actual = header.getNext();
			while (actual != trailer) {
				iterable.addLast(actual);
				actual = actual.getNext();
			}
		}
		return iterable;
	}
	
	
}
