package my.algorithm.basic.sort;

public class SelectionSort implements SortAlgorithm {
	
	public <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[i] = temp;
	}
	
	@Override
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		int n = arr.length; 
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			
			for (int j = i + 1; i < n; j++) {
				if (arr[min].compareTo(arr[j]) > 0) {
					min = j;
				}
			}
			
			if (min != i) {
				swap(arr, i, min);
			}
		}
		
		return arr; 
	}
	
	public static void main(String[] args) {

	  }

}
