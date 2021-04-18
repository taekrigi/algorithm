package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class CountTheNumberOfConsistentString {
	 
	public int countConsistentStrings(String allowed, String[] words) {
		Set<String> set = new HashSet<>();
	    for (int i = 0; i < allowed.length(); i++) set.add(String.valueOf(allowed.charAt(i)));  
	    
		return (int) Arrays.stream(words)
				.filter(w -> w.chars().allMatch(i -> set.contains(String.valueOf((char) i))))
				.count();
	}
}
