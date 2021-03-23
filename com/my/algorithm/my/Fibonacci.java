package my.algorithm.my;

import java.util.Arrays;

public class Fibonacci {
	
	private static int[] fibonacciByFor(int n) {
		int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;
		
		for (int i = 2; i < n; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		
		return array;
	}
	
	private static int[] fibonacciByRecursion(int n) {
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = fibonacciByIndex(i + 1);
		}
		return array;
	}
	
	private static int fibonacciByIndex(int index) {
		if (index <= 0) return 0;
		if (index == 1 || index == 2) return 1;
		return fibonacciByIndex(index - 2) + fibonacciByIndex(index - 1);
	};
	
	private static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		print(fibonacciByFor(10));
		print(fibonacciByRecursion(10));
	}

}
