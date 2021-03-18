package my.algorithm.programmers;

import java.util.Stack;

// https://programmers.co.kr/learn/courses/30/lessons/64061
public class 크레인인형뽑기게임 {
	
	public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int item = board[j][moves[i] - 1];
                if (item != 0) {
                    board[j][moves[i] - 1] = 0;
                    if (!basket.empty() && basket.peek() == item) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(item);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }

}
