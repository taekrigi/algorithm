package my.algorithm.programmers;

import java.util.Arrays;

public class NumberOfKIndex {

	 public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2] - 1];
        }

        return answer;
     }
}
