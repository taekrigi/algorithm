package my.algorithm.programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// https://programmers.co.kr/learn/courses/30/lessons/1845
public class ÆùÄÏ¸ó {

	public int solution(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int count = nums.length / 2;
        
        return count < set.size() ? count : set.size();
    }
}
