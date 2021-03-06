package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12925
public class 문자열을정수로바꾸기 {
	
	public int solution(String s) {
        return Integer.parseInt(
            s.charAt(0) == '+' || s.charAt(0) == '-' ? 
            s.charAt(0) + s.substring(1) : s
        );
    }

}
