package my.algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/12910
public class ����������¼��ڹ迭 {

	 public int[] solution(int[] arr, int divisor) {
	        List<Integer> list = new ArrayList<>();
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % divisor == 0) {
	                list.add(arr[i]);
	            }
	        }
	        
	        return list.isEmpty() ? 
	            new int[] { -1 } : 
	            list.stream()
	                .sorted()
	                .mapToInt(i -> i)
	                .toArray();
	    }
}
