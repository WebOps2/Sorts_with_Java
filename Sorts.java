package j_sorts;

import java.util.Random;

public class Sorts {

	public static void swap(int[] a, int i, int j) {
		// start here by translating the swap function from sorts.py
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void shuffle(int[] a) {
		Random rng = new Random();
		for (int i = a.length - 1; i > 0; i--) {
			int j = rng.nextInt(i + 1);
			swap(a, i, j);
		}
	}

	public static boolean isSorted(int[] a) {
		if (a.length < 2) {
			return true;
		}
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void iSort(int[] a) {
		int i = 1;
		while (i < a.length) {
			int j = i;
			while (j > 0) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					j = j - 1;
				} else {
					break;
				}
			}
			i = i + 1;
		}
	}

	public static void sSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}
			swap(a, i, min_index);
		}
	}

	public static void qSort(int[] a) {
		qSortImpl(a, 0, a.length - 1);
	}

	public static void qSortImpl(int[] a, int lo, int hi) {
		if (lo >= hi || lo < 0) {
			return;
		}
		int p = partition(a, lo, hi);
		qSortImpl(a, lo, p - 1);
		qSortImpl(a, p + 1, hi);
	}

	public static int partition(int[] a, int lo, int hi) {
		int pivot = a[hi];
		int i = lo - 1;
		for (int j = lo; j < hi; j++) {
			if (a[j] <= pivot) {
				i++;
				swap(a, i, j);
			}
		}
		i++;
		swap(a, i, hi);
		return i;
	}
	
	public static void bogoSort(int[] a) {
		while(!Sorts.isSorted(a)) {
			Sorts.shuffle(a);
		}
	}
	
	public static void bozoSort(int[] a) {
		Random rng = new Random();
		while(!Sorts.isSorted(a)) {
			int i = rng.nextInt(a.length);
			int j = rng.nextInt(a.length);
			Sorts.swap(a, i, j);
		}
	}

	// add the remaining translated functions from sorts.py here

}
