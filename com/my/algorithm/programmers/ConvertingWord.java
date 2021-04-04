package my.algorithm.programmers;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

// TODO: to resolve timeout...!
public class ConvertingWord {
	
	public int solution(String begin, String target, String[] words) {
        return dfs(begin, target, words, 0);
    }
    
    private int dfs(String word, String target, String[] words, int phrase) {
        if (phrase > words.length) return 0;
        if (word.equals(target)) return phrase;
        
        String[] changeableWords = Arrays.stream(words)
            .filter(isOnlyOneAlphabetDifferent(word))
            .toArray(String[]::new);
        
        if (changeableWords.length == 0) return 0;

        int min = Integer.MAX_VALUE;
        
        for (String changeable : changeableWords) {
            int count = dfs(changeable, target, words, phrase + 1);
            if (count != 0 && count < min) min = count;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
    
    private Predicate<String> isOnlyOneAlphabetDifferent(String compare) {
        return word -> 
            word.length() != compare.length() ? 
            false :
            IntStream.range(0, word.length())
                .filter(i -> word.charAt(i) == compare.charAt(i))
                .count() 
                == word.length() - 1;
    };
}
