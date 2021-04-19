package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/destination-city/submissions/
public class DestinationCity {
	
	public String destCity(List<List<String>> paths) {
		Map<String, Integer> trips = new HashMap<>();
		
		paths.stream().forEach(path -> 
			path.stream().forEach(city -> trips.put(city, trips.getOrDefault(city, 0) + 1))
		);
		
		return paths.stream()
				.filter(p -> trips.get(p.get(1)) == 1)
				.findFirst()
				.get()
				.get(1);
	}

}
