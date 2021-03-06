package my.algorithm.programmers;

import java.util.Arrays;
import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/12906
public class �������ڴ½Ⱦ� {
	
	public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        return Arrays.stream(arr)
            .filter(a -> !stack.isEmpty() && stack.peek() == a ? false : stack.add(a))
            .toArray();
    }

}
