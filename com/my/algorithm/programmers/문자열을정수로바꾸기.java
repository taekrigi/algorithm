package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12925
public class ���ڿ��������ιٲٱ� {
	
	public int solution(String s) {
        return Integer.parseInt(
            s.charAt(0) == '+' || s.charAt(0) == '-' ? 
            s.charAt(0) + s.substring(1) : s
        );
    }

}
