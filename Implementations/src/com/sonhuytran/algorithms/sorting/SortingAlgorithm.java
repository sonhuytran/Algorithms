/**
 * 
 */
package com.sonhuytran.algorithms.sorting;

/**
 * @author Son-Huy TRAN
 * 
 */
abstract class SortingAlgorithm {
	protected SortingOrder order = null;

	protected void setSortingOrder(SortingOrder order) {
		if (null == order) {
			this.order = SHSorter.DEFAULT_ORDER;
		} else {
			this.order = order;
		}
	}

	public <T extends Comparable<T>> void sort(T[] inputs) {
		this.sort(inputs, this.order);
	}

	public abstract <T extends Comparable<T>> void sort(T[] inputs,
			SortingOrder order);
}
