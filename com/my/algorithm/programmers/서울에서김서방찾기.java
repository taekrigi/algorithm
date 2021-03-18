package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12919
public class 서울에서김서방찾기 {
	
	 public String solution(String[] seoul) {
	        for (int i = 0; i < seoul.length; i++) {
	            if ("Kim".equals(seoul[i])) return String.format("�輭���� %d�� �ִ�", i);
	        }
	        return null;
	    }
}
