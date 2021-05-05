package my.algorithm.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class ReverseWordsInString {
	public String reverseWords(String s) {
		return Arrays.stream(s.split(" "))
				.map(e -> new StringBuilder(e).reverse())
				.collect(Collectors.joining(" "));
	}
}
