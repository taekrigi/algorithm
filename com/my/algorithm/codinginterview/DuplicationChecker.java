package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.281 - 1.1
 * 
 * �ߺ��� ���°�
 * 
 * ���ڿ��� �־����� ��, �� ���ڿ��� ���� ���ڰ� �ߺ��Ǿ� �����ϴ��� Ȯ���ϴ� �˰����� �ۼ��϶�.
 * �ڷᱸ���� �߰��� ������� �ʰ� Ǯ �� �ִ� �˰��� ���� ����϶�.
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
	public void �ߺ���_���ڰ�_������_true_��_�����Ѵ�() {
		assertEquals(isUniqueChars("park"), true);
	}
	
	@Test
	public void �ߺ���_���ڰ�_������_false_��_�����Ѵ�() {
		assertEquals(isUniqueChars("hawaii"), false);
	}
	
	@Test
	public void ���鹮�ڴ�_true_��_�����Ѵ�() {
		assertEquals(isUniqueChars(""), true);
	}
	
	@Test
	public void ���ڿ�_���̰�_128_����_ũ��_false_��_�����Ѵ�() {
		char[] chars = new char[200];
		for (int i = 0; i < 200; i++) {
			chars[i] = (char) i;
		}
		assertEquals(isUniqueChars(new String(chars)), false);
	}
}
