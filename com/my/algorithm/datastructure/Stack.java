package my.algorithm.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Stack<T> {

	private List<T> list = new LinkedList<>();
 	
	public Stack() {}
	
	public void push(T t) {
		list.add(t);
	}
	
	public void pop() {
		list.remove(list.size() - 1);
	}
	
	public T peek() {
		return list.get(list.size() - 1);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int search(T t) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(t)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		return list.toString();
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
