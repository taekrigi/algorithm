package my.algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

public class MakingStrangeString {
	
	public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("\\s+");
        List<Integer> indicesOfSpace = getIndicesOfSpace(s);
        
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                String str = String.valueOf(split[i].charAt(j));
                sb.append(j % 2 != 0 ? str.toLowerCase() : str.toUpperCase());
            }
        }
        
        for (int i = 0; i < indicesOfSpace.size(); i++) {
            sb.insert(indicesOfSpace.get(i), " ");
        }
        
        return sb.toString();
    }
    
    private List<Integer> getIndicesOfSpace(String s) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') indices.add(i);
        }
        return indices;
    }

}
