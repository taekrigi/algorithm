package my.algorithm.basic.sort;

import static my.algorithm.basic.sort.SortUtils.*;

public class QuickSort implements SortAlgorithm {

	@Override
	public <T extends Comparable<T>> T[] sort(T[] array) {
		doSort(array, 0, array.length - 1);
		return null;
	}
	
	private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
		if (left < right) {
			int pivot = randomPartition(array, left, right);
			doSort(array, left, pivot - 1);
			doSort(array, pivot, right);
		}
	}
	
	private static <T extends Comparable<T>> int randomPartition(T[] array, int left, int right) {
		int randomIndex = left + (int) (Math.random() * (right - left + 1));
		swap(array, randomIndex, right);
		return partition(array, left, right);
	}
	
	// TODO
	private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
		return 0;
	}

}
