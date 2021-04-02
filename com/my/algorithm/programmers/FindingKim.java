package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12919
public class FindingKim {
	
	 public String solution(String[] seoul) {
	        for (int i = 0; i < seoul.length; i++) {
	            if ("Kim".equals(seoul[i])) return String.format("김서방은 %d 에 있다.", i);
	        }
	        return null;
	    }
}
