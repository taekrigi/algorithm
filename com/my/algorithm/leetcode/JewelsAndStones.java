package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/jewels-and-stones/submissions/
public class JewelsAndStones {
	
	public int numJewelsInStones(String jewels, String stones) {
		Set<String> jewelsSet = new HashSet<>(Arrays.asList(jewels.split("")));
		
		return (int) Arrays.stream(stones.split(""))
				.filter(jewelsSet::contains)
				.count();
	}

}
