package my.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/42746
public class BiggestNumber {
	
	public String solution(int[] numbers) {
        return 
             Arrays.stream(numbers).allMatch(i -> i == 0) ? 
             "0" : 
             Arrays.stream(numbers)
            .boxed()
            .map(String::valueOf)
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .collect(Collectors.joining(""));
    }

}
