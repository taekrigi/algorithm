package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPair {
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> pairs = new HashMap<>();
		for (int num : nums) {
			pairs.put(num, pairs.getOrDefault(num, 0) + 1);
		}
		
		int sum = 0;
		for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            if (entry.getValue() != 1) {
               sum += sumSequence(entry.getValue()); 
            }
		}
		
		return sum;
    }
	
	private int sumSequence(int num) {
		int sum = 1;
		for (int i = 2; i < num; i++) {
			sum += i;
		}
		return sum;
	}
}
