package my.algorithm.programmers;

import java.util.HashSet;
import java.util.Set;

// https://programmers.co.kr/learn/courses/30/lessons/42862
public class GymSuit {
	
	 public int solution(int n, int[] lost, int[] reserve) {
	        Set<Integer> lostSet = toSet(lost);
	        Set<Integer> reserveSet = toSet(reserve);
	        
	        int additionalCount = 0;
	        
	        for (int i = 0; i < lost.length; i++) {
	            int lostStudent = lost[i];
	            
	            if (reserveSet.contains(lostStudent)) {
	                reserveSet.remove(lostStudent);
	                additionalCount++;
	            } else if (reserveSet.contains(lostStudent - 1) && !lostSet.contains(lostStudent - 1)) {
	                reserveSet.remove(lostStudent - 1);
	                additionalCount++;
	            } else if (reserveSet.contains(lostStudent + 1) && !lostSet.contains(lostStudent + 1)) {
	                reserveSet.remove(lostStudent + 1);
	                additionalCount++;
	            }
	        }
	        
	        return n - lost.length + additionalCount;
	    }
	    
	    private Set<Integer> toSet(int[] array) {
	        Set<Integer> set = new HashSet<>();
	        for (int i = 0; i < array.length; i++) {
	            set.add(array[i]);
	        }
	        return set;
	    }
}
