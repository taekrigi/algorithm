package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12947
public class Harshad {

	public boolean solution(int x) {
        return x / getSumOfDigit(x) == 0;
    }
	
	private int getSumOfDigit(int x) {
		return String.valueOf(x).chars().map(c -> Integer.parseInt("" + c)).sum();
	}
}
