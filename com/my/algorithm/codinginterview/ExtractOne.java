package my.algorithm.codinginterview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * P.289 - 1.5
 * 
 * 하나 뺴기
 * 
 * 문자열을 편집하는 방법: 문자 삽입, 삭제, 교체
 * 문자열을 같게 만들기 위한 편빕 횟수가 1회 이내인지 확인하는 함수를 작성하라.
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
	public void bale_과_pale_은_하나만_교체하면_된다() {
		assertEquals(oneEditAway("bale", "pale"), true);
	}
	
	@Test
	public void aple_과_apple_은_하나만_삽입하면_된다() {
		assertEquals(oneEditAway("aple", "apple"), true);
	}
	
	@Test
	public void apple_과_aple_은_하나만_삭제하면_된다() {
		assertEquals(oneEditAway("apple", "aple"), true);
	}
	
	@Test
	public void 길이가_2이상_차이나면_false_이다() {
		assertEquals(oneEditAway("aapple", "aple"), false);
	}
}
