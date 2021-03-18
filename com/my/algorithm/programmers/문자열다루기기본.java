package my.algorithm.programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/12918
public class 문자열다루기기본 {
	
	 public boolean solution(String s) {
	        return (s.length() == 4 || s.length() == 6) && 
	            Arrays.stream(s.split(""))
	                .allMatch(a -> a.matches("\\d+"));
	    }
}
