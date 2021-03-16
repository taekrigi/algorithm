package my.algorithm.programmers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// https://programmers.co.kr/learn/courses/30/lessons/42587
public class Printer {

	 public int solution(int[] priorities, int location) {
		Queue<Print> prints = new LinkedList<>();
		
		for (int i = 0; i < priorities.length; i++) prints.add(new Print(priorities[i], i));
		
		int answer = 0;
		
		while (!prints.isEmpty()) {
			Print print = prints.poll();
			Iterator<Print> it = prints.iterator();
			boolean hasPriority = false;
			
			while (it.hasNext()) {
				Print next = it.next();
				if (next.getPriority() > print.getPriority()) {
					prints.add(print);
					hasPriority = true;
					break;
				}
			}
			
			if (!hasPriority) {
				answer++;
				if (print.getIndex() == location) {
					return answer;
				}
			}
		}
		

        return answer;
	 }
}

class Print {
	private int priority;
	private int index;
	
	public Print(int priority, int index) {
		this.priority = priority;
		this.index = index;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public int getIndex() {
		return this.index;
	}
}
