package my.algorithm.leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {

	public int maximumWealth(int[][] accounts) {
		return Arrays.stream(accounts)
				.mapToInt(arr -> Arrays.stream(arr).sum()).max()
				.getAsInt();
    }
}
