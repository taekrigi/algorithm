package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// https://leetcode.com/problems/unique-number-of-occurrences/
public class UniqueNumberOfOccurrences {

	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> store = new HashMap<>();
		for (int a : arr) {
			store.put(a, store.getOrDefault(a, 0) + 1);
		}
		
		return store.size() == new HashSet<>(store.values()).size();
	}
}
