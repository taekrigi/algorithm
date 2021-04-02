package my.algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/12933
public class SortingIntegerDesc {
	
	public long solution(long n) {
        return Long.parseLong(
            Arrays.stream(
                new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .split("")
            ).sorted(Collections.reverseOrder())
            .collect(Collectors.joining(""))
        );
    }

}
