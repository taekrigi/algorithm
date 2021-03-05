package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.289 - 1.5
 * 
 * �ϳ� ����
 * 
 * ���ڿ��� �����ϴ� ���: ���� ����, ����, ��ü
 * ���ڿ��� ���� ����� ���� ��� Ƚ���� 1ȸ �̳����� Ȯ���ϴ� �Լ��� �ۼ��϶�.
 */
public class ExtractOne {

	public boolean oneEditAway(String first, String second) {
		if (first.length() == second.length()) {
			return oneEditReplace(first, second);
		} else if (first.length() + 1 == second.length()) {
			return oneEditInsert(first, second);
		} else if (first.length() - 1 == second.length()) {
			return oneEditInsert(second, first);
		}
		return false;
	}
	
	public boolean oneEditReplace(String s1, String s2) {
		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
	
	public boolean oneEditInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	@Test
	public void bale_��_pale_��_�ϳ���_��ü�ϸ�_�ȴ�() {
		assertEquals(oneEditAway("bale", "pale"), true);
	}
	
	@Test
	public void aple_��_apple_��_�ϳ���_�����ϸ�_�ȴ�() {
		assertEquals(oneEditAway("aple", "apple"), true);
	}
	
	@Test
	public void apple_��_aple_��_�ϳ���_�����ϸ�_�ȴ�() {
		assertEquals(oneEditAway("apple", "aple"), true);
	}
	
	@Test
	public void ���̰�_2�̻�_���̳���_false_�̴�() {
		assertEquals(oneEditAway("aapple", "aple"), false);
	}
}
