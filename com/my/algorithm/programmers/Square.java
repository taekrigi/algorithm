package my.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class Square {
	
	public int[] solution(int[][] v) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                String key = (j == 0 ? "x" : "y") + v[i][j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            if (entries.getValue() == 1) {
                answer[entries.getKey().contains("x") ? 0 : 1] = 
                    Integer.parseInt(entries.getKey().substring(1));
            }
        }

        return answer;
    }

}
