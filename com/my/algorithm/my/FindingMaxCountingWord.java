package my.algorithm.my;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FindingMaxCountingWord {

	public String solution(String word) {
		int max = Integer.MIN_VALUE;
		String maxWord = "";

		Map<String, Integer> counts = new HashMap<>();
		
		for (int i = 0; i < word.length(); i++) {
			String s = String.valueOf(word.charAt(i));
			int count = counts.getOrDefault(s, 0) + 1;
			counts.put(s, count);
			
			if (count > max) {
				max = count;
				maxWord = s;
			}
		}
		
		return maxWord;
	}
	
	@Test
	public void test1() {
		assertEquals(solution("aaaabbbbbccccccdefg") , "c");
	}

}
