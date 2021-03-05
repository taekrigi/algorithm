package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.285 - 1.4
 * 
 * 회문 순열
 * 
 * 주어진 문자열이 회문 순열인지 확인
 */
public class Palindrome {
	
	public boolean isPermutationOfPalidrome1(String phrase) {
		int[] table = buildCharFrequencyTable1(phrase);
		return checkMaxOneOdd1(table);
	}
	
	public boolean checkMaxOneOdd1(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	
	public int getCharNumber1(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	public int[] buildCharFrequencyTable1(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

		for (char c : phrase.toCharArray()) {
			int x = getCharNumber1(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	
	@Test
	void 회문_순열은_true_를_리턴해야한다() {
		assertEquals(isPermutationOfPalidrome1("abcdcba"), true);
	}
	
	@Test
	void 비회문_순열은_false_를_리턴해야한다() {
		assertEquals(isPermutationOfPalidrome1("aabbccd"), false);
	}

}
