// https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < answer) break;

            String answerString = "";
            int current = 0;
            
            for (int j = i; j < s.length(); j++) {
               String currentString = s.substring(j, j + 1);
                if (answerString.contains(currentString)) {
                    answerString = "";
                    current = 0;
                    break;
                } else {
                    answerString += currentString;
                    current += 1;
                }

                if (answer < current) {
                    answer = current;
                }
            }
       }

       return answer;
    }

    public static void main(String[] args) {
        new LongestSubStringWithoutRepeatingCharacters().lengthOfLongestSubstring("");
    }
}