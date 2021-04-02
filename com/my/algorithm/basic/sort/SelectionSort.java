package my.algorithm.basic.sort;

public class SelectionSort implements SortAlgorithm {
	
	public <T> void swap(T[] arr, int i, int j) {
	    T temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	@Override
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		int n = arr.length; 
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			
			for (int j = i + 1; j < n; j++) {
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
		Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};

	    SelectionSort selectionSort = new SelectionSort();

	    Integer[] sorted = selectionSort.sort(arr);

	    SortUtils.print(sorted);

	    String[] strings = {"c", "a", "e", "b", "d"};
	    String[] sortedStrings = selectionSort.sort(strings);

	    SortUtils.print(sortedStrings);
	}

}
