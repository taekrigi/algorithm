package my.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class MinimumSubsequenceInNonIncreasingOrder {

	public List<Integer> minSubsequence(int[] nums) {
		Arrays.sort(nums);
		
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		
		List<Integer> answers = new ArrayList<>();
	
		int sum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			sum += nums[i];
			answers.add(nums[i]);
			if (sum > total - sum) {
				return answers;
			}
		}
		
		return null;
	}
}
