package my.algorithm.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/72410
public class RecommendingNewId {
	
	 public String solution(String new_id) {
	        String answer = new_id.toLowerCase();
	        answer = answer.replaceAll("[^a-z0-9\\-\\._]", "");
	        answer = removeConsecutiveDot(answer);
	        answer = removeDotOfIndexFirstOrLast(answer);
	        if ("".equals(answer)) answer = "a";
	        answer = removeAfterIndex(answer, 14); 
	        answer = addLastStringIfLengthIsLessThan(answer, 3);
	        
	        return answer;
	    }

	    private String removeConsecutiveDot(String answer) {
	        return answer.replaceAll("\\.{2,}", ".");
	    }
	    
	    private String removeDotOfIndexFirstOrLast(String answer) {
	        if ("".equals(answer)) return answer;
	        if (answer.charAt(0) == '.') answer = answer.substring(1);
	        if (!"".equals(answer) && answer.charAt(answer.length() - 1) == '.') {
	            answer = answer.substring(0, answer.length() - 1);
	        }
	         
	        return answer;
	    }
	    
	    private String removeAfterIndex(String answer, int afterIndex) {
	         if (answer.length() >= afterIndex + 1) {
	            answer = answer.substring(0, afterIndex + 1);
	            if (answer.charAt(answer.length() - 1) == '.') {
	                answer = answer.substring(0, answer.length() - 1);
	            }
	         }
	         return answer;
	    }
	    
	    private String addLastStringIfLengthIsLessThan(String answer, int lessThan) {
	         while (answer.length() < lessThan) {
	             answer += answer.charAt(answer.length() - 1);
	         }
	         return answer;
	    }
}
