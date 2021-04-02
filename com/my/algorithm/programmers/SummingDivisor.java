package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12928
public class SummingDivisor {
	
	public int solution(int n) {
        int sum = n == 0 || n == 1 ? 
            n : 
            n + 1;
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }

}
