package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12945
public class FibonacciNumber {
	
	public int solution(int n) {
        long[] memo = new long[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;
        if (n <= 2) return (int) memo[n];
        return (int) (fibonacci(3, n, memo) % 1234567);
    }

    private long fibonacci(int i, int n, long[] memo) {
        memo[i] = (memo[i - 2] % 1234567) + (memo[i - 1] % 1234567);
        if (i == n) return memo[i];
        return fibonacci(i + 1, n, memo);
    }
	
}
