package my.algorithm.programmers;

import java.util.Arrays;

public class AvgOfArray {
	
	public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

}
