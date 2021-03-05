package my.algorithm.codinginterview;

/*
 * P.78 - 예제 11
 * 
 * 팩토리얼
 */
public class Factorial {
	
	public int factorial(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
