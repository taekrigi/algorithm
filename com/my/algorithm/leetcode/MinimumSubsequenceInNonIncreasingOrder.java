package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class MinimumSubsequenceInNonIncreasingOrder {

	public List<Integer> minSubsequence(int[] nums) {
		int total = Arrays.stream(nums).sum();
		
		List<Integer> sequenceOrderByDesc = Arrays.stream(nums)
				.boxed()
				.sorted((a, b) -> b - a)
				.collect(Collectors.toList());
		
		int sum = 0;
		for (int i = 0; i < sequenceOrderByDesc.size(); i++) {
			sum += sequenceOrderByDesc.get(i);
			if (sum > total - sum) {
				return sequenceOrderByDesc.subList(0, i + 1);
			}
		}
		
		return null;
	}
}
