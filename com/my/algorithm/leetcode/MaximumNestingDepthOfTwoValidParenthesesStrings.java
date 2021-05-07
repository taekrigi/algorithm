package my.algorithm.leetcode;

import java.util.Stack;

// https://leetcode.com/problems/maximum-nesting-depth-of-two-valid-parentheses-strings/
public class MaximumNestingDepthOfTwoValidParenthesesStrings {

	public int[] maxDepthAfterSplit(String seq) {
		int[] answer = new int[seq.length()];
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < seq.length(); i++) {
			char c = seq.charAt(i);
			if (stack.isEmpty()) {
				stack.push(c);
				answer[i] = 0;
			}
			else if (c == ')' && stack.peek() == '(') {
				stack.pop();
				answer[i] = stack.size() % 2;
			}
			else {
				answer[i] = stack.size() % 2;
				stack.push(c);
			}
		}
		
		return answer;
	}
}
