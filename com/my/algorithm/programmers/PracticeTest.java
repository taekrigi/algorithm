package my.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://programmers.co.kr/learn/courses/30/lessons/42840
public class PracticeTest {
	
	public int[] solution(int[] answers) {
        int[][] patterns = {
          {1, 2, 3, 4, 5}, 
          {2, 1, 2, 3, 2, 4, 2, 5}, 
          {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] answerCounts = new int[patterns.length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    answerCounts[j]++;
                }
            }
        }
        
        int max = Arrays.stream(answerCounts).max().getAsInt();

        return IntStream.range(1, answerCounts.length + 1)
            .filter(i -> answerCounts[i - 1] == max)
            .toArray();
    }
}
