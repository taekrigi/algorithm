package my.algorithm.leetcode;

// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
        	answer[i] = nums[j];
        	answer[i + 1] = nums[n + j];
        }
        return answer;
    }
}
