package my.algorithm.programmers;

public class DescriminatingIntegerSquareRoot {
	
	 public long solution(long n) {
        double sqrt = Math.sqrt(n);

        return sqrt == (int) sqrt ? (long) Math.pow(sqrt + 1, 2) : -1;
    }

}
