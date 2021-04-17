package my.algorithm.leetcode;

// https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class SignOfTheProductOfAnArray {
	
	public int arraySign(int[] nums) {
		int minusCount = 0;
		for (int num : nums) {
			if (num == 0) return 0;
			if (num < 0) minusCount++;
		}
		return minusCount % 2 == 0 ? 1 : -1;
	}
}
