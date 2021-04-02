package my.algorithm.basic.sort;

import static my.algorithm.basic.sort.SortUtils.*;

public class BubbleSort implements SortAlgorithm {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] array) {
		for (int i = 0, size = array.length; i < size - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < size - 1 - i; j++) {
				if (greater(array[j], array[j + 1])) {
					swap(array, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
	    BubbleSort bubbleSort = new BubbleSort();
	    bubbleSort.sort(integers);

	    for (int i = 0; i < integers.length - 1; ++i) {
	      assert integers[i] <= integers[i + 1];
	    }
	    print(integers);

	    String[] strings = {"c", "a", "e", "b", "d"};
	    bubbleSort.sort(strings);
	    for (int i = 0; i < strings.length - 1; i++) {
	      assert strings[i].compareTo(strings[i + 1]) <= 0;
	    }
	    print(bubbleSort.sort(strings));
	}

}
