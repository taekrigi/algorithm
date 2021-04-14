package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
public class KidsWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max = Arrays.stream(candies).max().getAsInt();
		return Arrays.stream(candies)
				.mapToObj(i -> i + extraCandies >= max)
				.collect(Collectors.toList());
    }
}
