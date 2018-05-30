package dataStruct;

//import java.util.LinkedList.Node;

public class MyLinkedList<E> {
	int size = 0;
	
	Node<E> first;
	
	Node<E> last;
	
	public MyLinkedList() {
	}
	
	private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
	
	public boolean add(E e) {
		final Node<E> n = last;
		final Node<E> newNode = new Node<E>(n,e,null);
		last = newNode;
		if(n == null) {
			first = newNode;
		}else {
			n.next = newNode;
		}
		size++;
		return true;
	}

}
