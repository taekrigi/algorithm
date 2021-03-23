package my.algorithm.datastructure;

public class LinkedList<T> {
	
	class Node {
		private T value;
		private Node next;
		private boolean isLast;
		
		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public boolean isLast() {
			return isLast;
		}

		public void setLast(boolean isLast) {
			this.isLast = isLast;
		}
	}
	
	private Node first;
	private Node current;
	
	public void add(T t) {
		if (first == null) {
			first = new Node(t);
			current = first;
		} else {
			current.setNext(new Node(t));
			current = current.getNext();
		}
	}
	
	public T get(int index) throws Exception {
		Node node = first;
		
		if (index == 0) return node.getValue();
		
		for (int i = 1; i <= index; i++) {
			node = node.getNext();
		}
		
		if (node == first) {
			throw new Exception("Index out of array : " + index);
		}
		
		return node.getValue();
	}
}


