package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.293 - 1.6
 * 
 * ���ڿ� ����
 * 
 * ���ڿ��� �����϶� (aabcccaaa -> a2b1c3a3)
 */
public class Compress {

	public String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
	
	@Test
	public void aabcccaaa_��_a2b1c5a3_��_����ȴ�() {
		assertEquals(compress("aabcccaaa"), "a2b1c3a3");
	}
}
