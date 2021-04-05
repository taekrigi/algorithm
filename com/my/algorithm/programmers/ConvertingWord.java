package my.algorithm.programmers;

import java.util.stream.IntStream;

public class ConvertingWord {
	
private boolean[] used;
    
    public int solution(String begin, String target, String[] words) {
        used = new boolean[words.length];
        return dfs(begin, target, words, 0);
    }
    
    private int dfs(String word, String target, String[] words, int phrase) {
        if (phrase > words.length) return 0;
        if (word.equals(target)) return phrase;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (!used[i] && !word.equals(w) && isOnlyOneAlphabetDifferent(word, w)) {
                used[i] = true;
                int count = dfs(w, target, words, phrase + 1);
                if (count != 0 && count < min) {
                     min = count;
                }
                used[i] = false;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
    
    private boolean isOnlyOneAlphabetDifferent(String word, String compare) {
        return IntStream.range(0, word.length())
                .filter(i -> word.charAt(i) == compare.charAt(i))
                .count() 
                == word.length() - 1;
    };
}
