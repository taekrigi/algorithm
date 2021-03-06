package my.algorithm.programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12915
public class 문자열내마음대로정렬하기 {
	
	public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
            .sorted((a, b) -> {
                int diff = a.charAt(n) - b.charAt(n);
                return diff == 0 ? a.compareTo(b) : diff;
            })
            .toArray(String[]::new);
    }

}
