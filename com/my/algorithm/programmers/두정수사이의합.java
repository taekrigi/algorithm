package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12912
public class 두정수사이의합 {
	
	 public long solution(int a, int b) {
	        if (a == b) return a;
	        
	        long from = a > b ? b : a;
	        long to = a > b ? a : b;
	        long sum = 0;
	        
	        for (long i = from; i <= to; i++) {
	            sum += i;
	        }
	        
	        return sum;
	    }

}
