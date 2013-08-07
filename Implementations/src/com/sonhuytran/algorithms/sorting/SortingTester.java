/**
 * 
 */
package com.sonhuytran.algorithms.sorting;

import java.util.Arrays;

/**
 * @author Son-Huy TRAN
 * 
 */
public class SortingTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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