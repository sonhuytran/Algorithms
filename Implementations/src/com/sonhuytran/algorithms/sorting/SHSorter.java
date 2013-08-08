/**
 * 
 */
package com.sonhuytran.algorithms.sorting;

/**
 * @author Son-Huy TRAN
 * 
 */
public class SHSorter {

	public static final SortingAlgorithms DEFAULT_ALGORITHM = SortingAlgorithms.InsertionSort;
	public static final SortingOrder DEFAULT_ORDER = SortingOrder.NormalOrder;

	/**
	 * Singleton object
	 */
	private static SHSorter instance = null;

	/**
	 * Current algorithm used for sorting
	 */
	private SortingAlgorithms algorithm = null;

	/**
	 * Current sorting order used
	 */
	private SortingOrder order = null;

	/**
	 * @param algorithm
	 *            the algorithm to set
	 */
	private void setAlgorithm(SortingAlgorithms algorithm) {
		if (null == algorithm) {
			this.algorithm = SHSorter.DEFAULT_ALGORITHM;
		} else {
			this.algorithm = algorithm;
		}
	}

	private void setOrder(SortingOrder order) {
		if (null == order) {
			this.order = SHSorter.DEFAULT_ORDER;
		} else {
			this.order = order;
		}
	}

	/**
	 * Creates a new SHSorter object with a specific sorting algorithms and
	 * normal order
	 * 
	 * @param algorithm
	 *            the algorithm used, if null then the SHSorter.defaultAlgorithm
	 *            will be used
	 */
	private SHSorter(SortingAlgorithms algorithm) {
		this(algorithm, null);
	}

	/**
	 * Creates a new SHSorter object with a specific sorting algorithms and a
	 * specific order
	 * 
	 * @param algorithm
	 *            the algorithm used, SHSorter.defaultAlgorithm if null
	 * @param order
	 *            the order used, SHSorter.defaultOrder if null
	 */
	private SHSorter(SortingAlgorithms algorithm, SortingOrder order) {
		this.setAlgorithm(algorithm);
		this.setOrder(order);
	}

	/**
	 * get the singleton SHSorter object using the default sorting algorithm
	 * 
	 * @return the singleton SHSorter object
	 */
	public static SHSorter getInstance() {
		return getInstance(null, null);
	}

	/**
	 * get the singleton SHSorter object with a specific sorting algorithm
	 * 
	 * @param algorithm
	 *            the algorithm used, if null then the SHSorter.defaultAlgorithm
	 *            will be used
	 * @return the singleton SHSorter object
	 */
	public static SHSorter getInstance(SortingAlgorithms algorithm) {
		return getInstance(algorithm, null);
	}

	/**
	 * 
	 * @param order
	 * @return
	 */
	public static SHSorter getInstance(SortingOrder order) {
		return getInstance(null, order);
	}

	/**
	 * 
	 * @param algorithm
	 * @param order
	 * @return
	 */
	public static SHSorter getInstance(SortingAlgorithms algorithm,
			SortingOrder order) {
		// Creates a new object if needed
		if (null == SHSorter.instance) {
			SHSorter.instance = new SHSorter(algorithm, order);
		} else {
			SHSorter.instance.setAlgorithm(algorithm);
			SHSorter.instance.setOrder(order);
		}

		return SHSorter.instance;
	}

	/**
	 * Sorts the Comparable objects
	 * 
	 * @param inputs
	 *            the objects to sort
	 */
	public <T extends Comparable<T>> void sort(T[] inputs) {
		SortingAlgorithm sortingAlgorithm = null;

		switch (this.algorithm) {
		case InsertionSort:
			sortingAlgorithm = InsertionSortAlgorithm.getInstance(this.order);
			break;

		case MergeSort:
			sortingAlgorithm = MergeSortAlgorithm.getInstance(this.order);
			break;
		}

		sortingAlgorithm.sort(inputs);
	}
}