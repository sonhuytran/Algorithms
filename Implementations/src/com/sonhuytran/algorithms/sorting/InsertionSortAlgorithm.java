/**
 * 
 */
package com.sonhuytran.algorithms.sorting;

/**
 * @author Son-Huy TRAN
 * 
 */
class InsertionSortAlgorithm extends SortingAlgorithm {
	private static InsertionSortAlgorithm instance = null;

	private InsertionSortAlgorithm(SortingOrder order) {
		this.order = order;
	}

	public static InsertionSortAlgorithm getInstance(SortingOrder order) {
		if (null == InsertionSortAlgorithm.instance) {
			InsertionSortAlgorithm.instance = new InsertionSortAlgorithm(order);
		} else {
			InsertionSortAlgorithm.instance.setSortingOrder(order);
		}

		return InsertionSortAlgorithm.instance;
	}

	@Override
	public <T extends Comparable<T>> void sort(T[] inputs, SortingOrder order) {
		int i, j;

		if (order == SortingOrder.NormalOrder) {
			for (i = 1; i < inputs.length; i++) {
				T key = inputs[i];

				j = i - 1;

				while (j >= 0 && inputs[j].compareTo(key) > 0) {
					inputs[j + 1] = inputs[j];
					j--;
				}

				inputs[j + 1] = key;
			}
		} else {
			for (i = 1; i < inputs.length; i++) {
				T key = inputs[i];

				j = i - 1;

				while (j >= 0 && inputs[j].compareTo(key) < 0) {
					inputs[j + 1] = inputs[j];
					j--;
				}

				inputs[j + 1] = key;
			}
		}

	}
}