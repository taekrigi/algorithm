package my.algorithm.codinginterview;

import java.util.Arrays;

/*
 * P.282 - 1.2
 * 
 * ���� Ȯ��
 * 
 * ���ڿ� �� ���� �־����� �� �� ���� ���� ���� ���迡 �ִ��� Ȯ���϶�.
 */
public class PermutationChecker {
	
	public static String sort1(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	/*
	 * ������ �ƴ����� �ǿ뼺 ���鿡�� ���� �Ǹ��� Ǯ���̴�.
	 */
	public static boolean permutation1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort1(s).equals(sort1(t));
	}

	/*
	 * ASCII �� ����
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
