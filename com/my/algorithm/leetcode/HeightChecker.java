package my.algorithm.leetcode;

import java.util.Arrays;

public class HeightChecker {
	
	public int heightChecker(int[] heights) {
		int[] ascendingHeights = Arrays.stream(heights)
				.sorted()
				.toArray();
		
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != ascendingHeights[i]) {
				count++;
			}
		}
		
		return count;
	}

}
