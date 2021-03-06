package my.algorithm.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RangeAdditionII {
	
	public int maxCount(int m, int n, int[][] ops) {
		int[][] matrix = new int[m][n];
		int max = 0;
		
		for (int i = 0; i < ops.length; i++) {
			for (int j = 0; j < ops[i][0]; j++) {
				for (int k = 0; k < ops[i][1]; k++) {
					matrix[j][k]++;
					if (matrix[j][k] > max) max = matrix[j][k];
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == max) count++;
			}
		}
		
		return count;
    }
	
	@Test
	public void Å×½ºÆ®1() {
		assertEquals(maxCount(3, 3, new int[][] {{2, 2}, {3, 3}}), 4);
	}
	
	

}
