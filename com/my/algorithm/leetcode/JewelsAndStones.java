package my.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/jewels-and-stones/submissions/
public class JewelsAndStones {
	
	public int numJewelsInStones(String jewels, String stones) {
		Set<String> jewelsSet = new HashSet<>();
		
		for (int i = 0; i < jewels.length(); i++) jewelsSet.add(String.valueOf(jewels.charAt(i)));
		
		return (int) stones.chars()
				.filter(i -> jewels.contains(String.valueOf((char) i)))
				.count();
	}

}
