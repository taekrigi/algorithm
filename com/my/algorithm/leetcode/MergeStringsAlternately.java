package my.algorithm.leetcode;

// https://leetcode.com/problems/merge-strings-alternately/submissions/
public class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {
		String longerWord = word1.length() > word2.length() ? word1 : word2;
		String shorterWord = longerWord == word2 ? word1 : word2;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < shorterWord.length(); i++) {
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
		}
		
		sb.append(longerWord.substring(shorterWord.length()));
		
		return sb.toString();
	}
}
