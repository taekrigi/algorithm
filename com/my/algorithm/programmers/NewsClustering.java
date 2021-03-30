package my.algorithm.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// https://programmers.co.kr/learn/courses/30/lessons/17677
public class NewsClustering {
	
	public int solution(String str1, String str2) {
        String[] str1MultiSet = generateMultiSet(str1.toUpperCase());
        String[] str2MultiSet = generateMultiSet(str2.toUpperCase());
        
        if (str1MultiSet.length == 0 && str2MultiSet.length == 0) return 65536;
        
        SetCount setCount = getSetCount(str1MultiSet, str2MultiSet);
        
        int commonSetCount = setCount.getCommon();
        int combinedSetCount = setCount.getCombined();

        return (int) (((double) commonSetCount / (double) combinedSetCount) * 65536);
    }
	
	private int getCommonCount(Map<String, Integer> set1, Map<String, Integer> set2) {
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entries : set1.entrySet()) {
			if (set2.containsKey(entries.getKey())) {
				int min = Math.min(entries.getValue(), set2.get(entries.getKey()));
				for (int i = 0; i < min; i++) {
					 list.add(entries.getKey());
				}
			}
		}
		return list.size();
	}
	
	private int getCombinedCount(Map<String, Integer> set1, Map<String, Integer> set2) {
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entries : set1.entrySet()) {
			int max = Math.max(entries.getValue(), Optional.ofNullable(set2.get(entries.getKey())).orElse(0));
			for (int i = 0; i < max; i++) {
				 list.add(entries.getKey());
			}
		}
		for (Map.Entry<String, Integer> entries : set2.entrySet()) {
			if (set1.get(entries.getKey()) == null) {
				int max = Math.max(entries.getValue(), Optional.ofNullable(set2.get(entries.getKey())).orElse(0));
				for (int i = 0; i < max; i++) {
					 list.add(entries.getKey());
				}
			}
		}
		return list.size();
	}
	
	private SetCount getSetCount(String[] str1MultiSet, String[] str2MultiSet) {
		Map<String, Integer> set1 = new HashMap<>();
		Map<String, Integer> set2 = new HashMap<>();
		
		for (String str : str1MultiSet) set1.put(str, set1.getOrDefault(str, 0) + 1);
		for (String str : str2MultiSet) set2.put(str, set2.getOrDefault(str, 0) + 1);
		
		int commonCount = getCommonCount(set1, set2);
		int combinedCount = getCombinedCount(set1, set2);
		
		return new SetCount(commonCount, combinedCount);
	}
	
	private String[] generateMultiSet(String str) {
		List<String> multiSet = new ArrayList<>();
		
		for (int i = 0; i < str.length() - 1; i++) {
			String pair = str.charAt(i) + "" + str.charAt(i + 1);
			if (pair.chars().allMatch(Character::isLetter)) {
				multiSet.add(str.charAt(i) + "" + str.charAt(i + 1)); 
			}
		}

		return multiSet.stream().toArray(String[]::new);
	}
}

class SetCount {
	private int common;
	private int combined;

	public SetCount(int common, int combined) {
		this.common = common;
		this.combined = combined;
	}
	
	public int getCommon() {
		return common;
	}
	
	public int getCombined() {
		return combined;
	}
}
