package my.algorithm.codinginterview;

import java.util.Arrays;

/*
 * P.282 - 1.2
 * 
 * 순열 확인
 * 
 * 문자열 두 개가 주어졌을 때 이 둘이 서로 순열 관계에 있는지 확인하라.
 */
public class PermutationChecker {
	
	public static String sort1(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	/*
	 * 최적은 아니지만 실용성 측면에선 아주 훌륭한 풀이이다.
	 */
	public static boolean permutation1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort1(s).equals(sort1(t));
	}

	/*
	 * ASCII 라 가정
	 */
	public static boolean permutation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		char[] sArray = s.toCharArray();
		
		for (char c : sArray) {
			letters[c]++;
		}
		
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
	}

}
