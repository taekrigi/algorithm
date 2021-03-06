package my.algorithm.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://programmers.co.kr/learn/courses/30/lessons/68644
public class �ΰ��̾Ƽ����ϱ� {
	
	public int[] solution(int[] numbers) {
        Set<Integer> sums = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums.add(numbers[i] + numbers[j]);
            }
        }

        return Arrays.stream(sums.toArray())
            .mapToInt(i -> Integer.parseInt(String.valueOf(i)))
            .sorted()
            .toArray();
    }

}
