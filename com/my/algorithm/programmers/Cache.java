package my.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/17680
public class Cache {
	
	public int solution(int cacheSize, String[] cities) {
        Map<String, Integer> cache = new HashMap<>();
        int answer = 0;
        boolean isZeroCache = cacheSize == 0;
        
        for (int i = 0; i < cities.length; i++) {
           String city = cities[i].toLowerCase();
            
            if (isZeroCache) {
                answer += 5;
            } else if (cache.containsKey(city)) {
        		cache.put(city, i);
        		answer += 1;
        	} else {
                if (cache.size() == cacheSize) {
                	cache.remove(findKeyByLRU(cache));
                }
        		cache.put(city, i);
        		answer += 5;
        	} 
        }

        return answer;
    }
	
	private String findKeyByLRU(Map<String, Integer> cache) {
		int min = Integer.MAX_VALUE;
		String key = null;
		
		for (Map.Entry<String, Integer> entry : cache.entrySet()) {
			if (entry.getValue() < min) {
				min = entry.getValue();
				key = entry.getKey();
			}
		}
		return key;
	}
}
