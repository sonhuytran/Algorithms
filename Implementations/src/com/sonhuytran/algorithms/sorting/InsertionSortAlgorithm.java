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
	protected <T extends Comparable<T>> void doSort(T[] inputs, SortingOrder order,
			int begin, int stop) {
		assert stop < inputs.length;
		
		int i, j;

		if (order == SortingOrder.NormalOrder) {
			for (i = begin + 1; i < stop; i++) {
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