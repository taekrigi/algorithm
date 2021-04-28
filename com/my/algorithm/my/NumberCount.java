package my.algorithm.my;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class NumberCount {
	
	public Map<Integer, Integer> getNumberCount(int[] arr) {
		Map<Integer, Integer> result = new TreeMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
		}
		
		return result;
	}
	
	@Test
	public void test() {
		Map<Integer, Integer> result = new TreeMap<>();
		result.put(1, 4);
		result.put(2, 3);
		result.put(3, 3);
		assertEquals(result, getNumberCount(new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 }));
	}

}
