package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.281 - 1.1
 * 
 * 중복이 없는가
 * 
 * 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라.
 * 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
 */
public class DuplicationChecker {

	public boolean isUniqueChars(String str) {
		if (str.length() > 128) return false;
		boolean[] charSet = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}
	
	@Test
	public void 중복된_글자가_없으면_true_를_리턴한다() {
		assertEquals(isUniqueChars("park"), true);
	}
	
	@Test
	public void 중복된_글자가_있으면_false_를_리턴한다() {
		assertEquals(isUniqueChars("hawaii"), false);
	}
	
	@Test
	public void 공백문자는_true_를_리턴한다() {
		assertEquals(isUniqueChars(""), true);
	}
	
	@Test
	public void 문자열_길이가_128_보다_크면_false_를_리턴한다() {
		char[] chars = new char[200];
		for (int i = 0; i < 200; i++) {
			chars[i] = (char) i;
		}
		assertEquals(isUniqueChars(new String(chars)), false);
	}
}
