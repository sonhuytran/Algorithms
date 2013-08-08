/**
 * 
 */
package com.sonhuytran.algorithms.sorting;

import java.util.ArrayList;

/**
 * @author Son-Huy TRAN
 * 
 */
public class MergeSortAlgorithm extends SortingAlgorithm {
	private static MergeSortAlgorithm instance = null;

	private MergeSortAlgorithm(SortingOrder order) {
		this.order = order;
	}

	public static MergeSortAlgorithm getInstance(SortingOrder order) {
		if (null == MergeSortAlgorithm.instance) {
			MergeSortAlgorithm.instance = new MergeSortAlgorithm(order);
		} else {
			MergeSortAlgorithm.instance.setSortingOrder(order);
		}

		return MergeSortAlgorithm.instance;
	}

	@Override
	public <T extends Comparable<T>> void sort(T[] inputs, SortingOrder order) {
		this.sort(inputs, order, 0, inputs.length - 1);
	}

	private <T extends Comparable<T>> void sort(T[] inputs, SortingOrder order,
			int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			this.sort(inputs, order, p, q);
			this.sort(inputs, order, q + 1, r);
			this.merge(inputs, p, q, r, order);
		}
	}

	private <T extends Comparable<T>> void merge(T[] inputs, int p, int q,
			int r, SortingOrder order) {
		if (p > q || q > r) {
			throw new IllegalArgumentException("MUST HAVE p <= q <= r");
		}

		int length1 = q - p + 1;
		int length2 = r - q;

		ArrayList<T> left = new ArrayList<>(length1);
		ArrayList<T> right = new ArrayList<>(length2);

		for (int i = p; i <= q; i++) {
			left.add(inputs[i]);
		}

		for (int i = q + 1; i <= r; i++) {
			right.add(inputs[i]);
		}

		int i = 0, j = 0, k = p;
		T leftObject, rightObject;

		if (order == SortingOrder.NormalOrder) {
			while (i < length1 && j < length2) {
				leftObject = left.get(i);
				rightObject = right.get(j);

				if (leftObject.compareTo(rightObject) <= 0) {
					inputs[k] = leftObject;
					i++;
				} else {
					inputs[k] = rightObject;
					j++;
				}

				k++;
			}
		} else {
			while (i < length1 && j < length2) {
				leftObject = left.get(i);
				rightObject = right.get(j);

				if (leftObject.compareTo(rightObject) >= 0) {
					inputs[k] = leftObject;
					i++;
				} else {
					inputs[k] = rightObject;
					j++;
				}

				k++;
			}
		}

		while (i < length1) {
			leftObject = left.get(i);
			inputs[k] = leftObject;
			i++;
			k++;
		}

		while (j < length2) {
			rightObject = right.get(j);
			inputs[k] = rightObject;
			j++;
			k++;
		}
	}
}
