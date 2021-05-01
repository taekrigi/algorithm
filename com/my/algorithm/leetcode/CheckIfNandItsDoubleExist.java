package my.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/submissions/
public class CheckIfNandItsDoubleExist {

	public boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> targets = new HashMap<>();
		
		for (int a : arr) {
			targets.put(a, targets.getOrDefault(a, 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> entries : targets.entrySet()) {
			int key = entries.getKey();
			if ((key == 0 && entries.getValue() > 1) || (key != 0 && targets.containsKey(key * 2))) {
				return true;
			} 
		}
		
		return false;
	}
}
