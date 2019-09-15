package Utilidad.Lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Mi_Iterator<E> implements Iterator<E> {
	protected PositionList<E> list;
	protected Position<E> cursor;
	
	public Mi_Iterator(PositionList<E> l) {
		list = l;
		if (list.isEmpty()) {
			cursor = null;
		}
		else {
			try {
				cursor = list.first();
			} catch (EmptyListException e) {}
		}
	}
	
	public boolean hasNext() {
		return cursor != null;
	}
	
	public E next() throws NoSuchElementException {
		if (cursor == null) {
			throw new NoSuchElementException();
		}
		E resultado = cursor.element();
		try {
			cursor = (cursor == list.last()) ? null : list.next(cursor);
		} catch (EmptyListException | InvalidPositionException | BoundaryViolationException e) {}
		return resultado;
	}
}
