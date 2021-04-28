package my.algorithm.my;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class MoneyCount {

	public Map<Integer, Integer> getMoneyCount(int money) {
		int[] units = new int[] { 50000, 10000, 5000, 1000, 500, 100, 50, 10};
		Map<Integer, Integer> result = new TreeMap<>();
		int thisMoney = money;
		
		for (int unit : units) {
			int count = thisMoney / unit;
			thisMoney = thisMoney % unit;
			result.put(unit, count);
		}
		
		return result;
	}
	
	@Test
	public void test() {
		Map<Integer, Integer> result = new HashMap<>();
		result.put(50000, 3);
		result.put(10000, 0);
		result.put(5000, 0);
		result.put(1000, 2);
		result.put(500, 0);
		result.put(100, 3);
		result.put(50, 1);
		result.put(10, 1);
		assertEquals(result, getMoneyCount(152360));
	}
}
