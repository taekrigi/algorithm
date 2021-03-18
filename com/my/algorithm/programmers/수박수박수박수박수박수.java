package my.algorithm.programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://programmers.co.kr/learn/courses/30/lessons/12922
public class 수박수박수박수박수박수 {
	public String solution(int n) {
        return IntStream.range(0, n)
            .mapToObj(i -> (i + 1) % 2 != 0 ? "��" : "��")
            .collect(Collectors.joining(""));
    }
}
