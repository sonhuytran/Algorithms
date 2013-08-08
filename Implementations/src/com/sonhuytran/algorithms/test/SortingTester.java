/**
 * 
 */
package com.sonhuytran.algorithms.test;

import java.util.Arrays;

import com.sonhuytran.algorithms.sorting.SHSorter;
import com.sonhuytran.algorithms.sorting.SortingAlgorithms;
import com.sonhuytran.algorithms.sorting.SortingOrder;

/**
 * @author Son-Huy TRAN
 * 
 */
@SuppressWarnings("unused")
public class SortingTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testMergeSort();
	}

	private static void testMergeSort() {
		Integer[] input = new Integer[] { 9, 6, 7, 2, 5, 8, 4, 3 };
		Integer[] input1 = new Integer[] { 9 };
		Integer[] input2 = new Integer[] { 9, 8 };
		Integer[] input3 = new Integer[] {};

		SHSorter sorter = SHSorter.getInstance(SortingAlgorithms.MergeSort);
		sorter.sort(input);
		sorter.sort(input1);
		sorter.sort(input2);
		sorter.sort(input3);

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3));

		SHSorter sorter1 = SHSorter.getInstance(SortingAlgorithms.MergeSort,
				SortingOrder.ReverseOrder);
		sorter1.sort(input);
		sorter1.sort(input1);
		sorter1.sort(input2);
		sorter1.sort(input3);

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3));
	}

	private static void testInsertionSort() {
		Integer[] input = new Integer[] { 9, 6, 7, 2, 5, 8, 4, 3 };
		Integer[] input1 = new Integer[] { 9 };
		Integer[] input2 = new Integer[] { 9, 8 };
		Integer[] input3 = new Integer[] {};

		SHSorter sorter = SHSorter.getInstance();
		sorter.sort(input);
		sorter.sort(input1);
		sorter.sort(input2);
		sorter.sort(input3);

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3));

		SHSorter sorter1 = SHSorter.getInstance(SortingOrder.ReverseOrder);
		sorter1.sort(input);
		sorter1.sort(input1);
		sorter1.sort(input2);
		sorter1.sort(input3);

		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(input2));
		System.out.println(Arrays.toString(input3));
	}
}