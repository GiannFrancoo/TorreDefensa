package Utilidad.Lista;

public class dNode<E> implements Position<E> {
	
	protected E elem;
	protected dNode<E> prev, next;
	
	public dNode(dNode<E> newPrev, dNode<E> newNext, E elem){
		this.elem = elem;
		prev = newPrev;
		next = newNext;
	}
	
	public E element() {
		return elem;
	}
	
	public dNode<E> getNext(){
		return next;
	}
	
	public dNode<E> getPrev(){
		return prev;
	}
	
	public void setPrev(dNode<E> newPrev) {
		prev = newPrev;
	}
	
	public void setNext(dNode<E> newNext) {
		next = newNext;
	}
	
	public void setElem(E elem) {
		this.elem = elem;
	}
}
