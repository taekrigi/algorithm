package my.algorithm.datastructure;

public class LinkedList<T> {
	
	private class Node {
		private T value;
		private Node next;
		
		public Node(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node first;
	private Node current;
	private int size;
	
	public void add(T t) {
		Node next = new Node(t);
		
		if (first == null) {
			first = next;
			current = first;
			size = 1;
			return;
		} 
		
		current.setNext(next);
		current = current.getNext();
		size += 1;
	}
	
	public T get(int index) throws Exception {
		if (index >= size) throw new ArrayIndexOutOfBoundsException(index);
		
		Node node = first;

		for (int i = 1; i <= index; i++) {
			node = node.getNext();
		}
		
		return node.getValue();
	}
	
	public void remove(int index) {
		if (index >= size) throw new ArrayIndexOutOfBoundsException(index);
		
		Node node = first;
		Node prev = null;

		if (index == 0) {
			first = node.getNext();
			size--;
			return;
		}
		
		for (int i = 1; i <= index; i++) {
			prev = node;
			node = node.getNext();
		}
		
		prev.setNext(node.getNext());
		size--;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node node = first;
		
		sb.append('[');
		for (int i = 0; i < size; i++) {
			sb.append(node.getValue() + (isLastIndex(i, size) ? "" : ", "));
			node = node.getNext();
		}
		
		sb.append(']');
		
		return sb.toString();
	}
	
	private boolean isLastIndex(int i, int size) {
		return i == size - 1;
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(10);
		list.remove(0);
		list.remove(list.size() - 1);
		System.out.println(list.size());
		System.out.println(list);
	}
}


