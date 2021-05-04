package my.algorithm.leetcode;

// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/
public class ReplaceElementsWithGreatestElementOnRightSide {
	
	public int[] replaceElements(int[] arr) {
		int length = arr.length;
		int[] output = new int[length];
		for (int i = 0; i < length; i++) {
			int max = -1;
			for (int j = i + 1; j < length; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
			}
			output[i] = max;
		}
		
		return output;
	}

}
