package my.algorithm.programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/42747?language=java#fn1
public class HIndex {
	
	public int solution(int[] citations) {
        int h = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= h) return h;
            h--;
        }

        return 0;
    }
}
