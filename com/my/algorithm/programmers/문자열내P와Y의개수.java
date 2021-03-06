package my.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/12916
public class 문자열내P와Y의개수 {
	
	boolean solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            String key = ("" + s.charAt(i)).toUpperCase();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return map.get("P") == map.get("Y");
    }

}
