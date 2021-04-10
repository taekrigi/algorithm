package my.algorithm.programmers;

import java.util.Arrays;

public class RemovingMinNumber {

	public int[] solution(int[] arr) {
		int min = Arrays.stream(arr).min().orElse(-1);
		int[] newArr = Arrays.stream(arr)
        		.filter(e -> e != min)
        		.toArray();
        return newArr.length != 0 ? newArr : new int[] { -1 };
    }
}
