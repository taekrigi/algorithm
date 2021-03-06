package my.algorithm.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
	
	 public int[] runningSum(int[] nums) {
		 List<Integer> sums = new ArrayList<>();
		 
		 int prev = 0;
		 for (int i = 0; i < nums.length; i++) {
			 int value = prev + nums[i];
			 sums.add(value);
			 prev = value;
		 }
		 return sums.stream()
				 .mapToInt(i -> i.intValue())
				 .toArray();
	 }
	 
	 @Test
	 public void Å×½ºÆ®1() {
		 assertArrayEquals(runningSum(new int[] {1, 2, 3, 4}), new int[] {1, 3, 6, 10});
	 }
	 

}
