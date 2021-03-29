package my.algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SortByFileName {
	
	public String[] solution(String[] files) {
        return Arrays.stream(files)
        		.sorted((a1,a2) -> {
        			String[] a1File = split(a1);
        			String[] a2File = split(a2);
        			
        			int head = a1File[0].toLowerCase().compareTo(a2File[0].toLowerCase());
        			int number = Integer.parseInt(a1File[1]) - Integer.parseInt(a2File[1]);
        			
        			return head != 0 ? head : number;
        		})
        		.toArray(String[]::new);
	 }
 
	 private String[] split(String file) {
		 Map<String, String> parts = new HashMap<>();
	
		 for (int i = 0; i < file.length(); i++) {
			 char c = file.charAt(i);
			 
			 if (parts.get("head") == null && Character.isDigit(c)) {
			    parts.put("head", file.substring(0, i));
			 } 
	         if (parts.get("head") != null && parts.get("number") == null && !Character.isDigit(c)) {
				String number = file.substring(parts.get("head").length(), i);
				parts.put("number", number.length() > 5 ? number.substring(0, 5) : number);
			 }
	         if (parts.get("number") == null &&  i == file.length() - 1) {
	            parts.put("number", file.substring(parts.get("head").length()));
	         }
		 }
	     
	     parts.put("tail", file.substring(parts.get("head").length() + parts.get("number").length()));
	
		 return new String[] { 
			 parts.get("head"), 
			 parts.get("number"), 
			 parts.get("tail") 
		};
	 }
}
