package my.algorithm.programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/12917
public class 문자열내림차순으로배치하기 {
	
	 public String solution(String s) {
	        return Arrays.stream(s.split(""))
	            .sorted((a, b) -> {
	                char charA = a.charAt(0);
	                char charB = b.charAt(0);
	                return Character.isUpperCase(charA) && Character.isLowerCase(charB) ? 1 : 
	                    Character.isLowerCase(charA) && Character.isUpperCase(charB) ? -1 :
	                    charB - charA;
	            })
	            .collect(Collectors.joining(""));
	    }
}
