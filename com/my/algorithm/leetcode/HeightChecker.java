package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://leetcode.com/problems/height-checker/submissions/
public class HeightChecker {
	
	public int heightChecker(int[] heights) {
		int[] ascendingHeights = Arrays.stream(heights)
				.sorted()
				.toArray();
		
		return (int) IntStream.range(0, heights.length)
				.filter(i -> heights[i] != ascendingHeights[i])
				.count();
	}

}
