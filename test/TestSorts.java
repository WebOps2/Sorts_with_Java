package j_sorts.test;

import java.util.Arrays;

import a1.Sorts;

public class TestSorts {
	// translate the program test_sorts.py into this class
	public static int[] beforeSort(int[] a, String name) {
		System.out.println(name);
		int[] copy = a.clone();
		System.out.println(Arrays.toString(copy));
		System.out.println("is sorted? " + Sorts.isSorted(copy));
		return copy;
	}
	
	public static void afterSort(int[] a) {
		System.out.println("is sorted? " + Sorts.isSorted(a));
		System.out.println(Arrays.toString(a));
		System.out.println("");
	}
	public static void main(String[] args) {
		int n = 11;
		int[]orig = new int[n];
		for(int i = 0; i < n; i++) {
			orig[i] = i;
		}
		Sorts.shuffle(orig);
		
		int[] a = TestSorts.beforeSort(orig, "INSERTION SORT");
		Sorts.iSort(a);
		TestSorts.afterSort(a);
		
		a = TestSorts.beforeSort(orig, "SELECTION SORT");
		Sorts.sSort(a);
		TestSorts.afterSort(a);

		
		a = TestSorts.beforeSort(orig, "QUICK SORT");
		Sorts.qSort(a);
		TestSorts.afterSort(a);
		
		
		a = TestSorts.beforeSort(orig, "BOGOSORT");
		Sorts.bogoSort(a);
		TestSorts.afterSort(a);
		
		a = TestSorts.beforeSort(orig, "BOZOSORT");
		Sorts.bozoSort(a);
		TestSorts.afterSort(a);
		
		
		
	}
	
}
