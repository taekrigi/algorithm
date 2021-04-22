package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPair {
	
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> pairs = new HashMap<>();
		
		for (int num : nums) pairs.put(num, pairs.getOrDefault(num, 0) + 1);

		return pairs.values().stream()
				.filter(this::isNotOnlyOne)
				.mapToInt(this::sumSequence)
				.sum();
	}

	private int sumSequence(int num) {
		return num * (num - 1) / 2;
	}
	
	private boolean isNotOnlyOne(int value) {
		return value != 1;
	}
}
