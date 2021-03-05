package my.algorithm.programmers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeFinder {
	
	public int[] getPermutations(String numbers) {
		List<Integer> permutations = new ArrayList<>();
		
		for (int i = 0; i < numbers.length(); i++) {
			getPermutation(permutations, numbers, i + 1);
		}
		
		return null;
	}
	
	public int[] getPermutation(List<Integer> list, String numbers, int permuSize) {
		for (int i = 0; i < numbers.length(); i++) {
			
		}
		
		return null;
	}

}
