/**
 * 
 */
package com.sonhuytran.algorithms.searching.impl;

import java.util.Comparator;
import java.util.List;

/**
 * @author Son-Huy TRAN
 * 
 */
public class BinarySearchAlgorithm extends AbstractSearchingAlgorithm {

	@Override
	public <T> int doSearch(T[] objects, T key) {
		return doSearch(objects, key, null);
	}

	@Override
	public <T> int doSearch(List<T> objects, T key) {
		return doSearch(objects, key, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T1, T2 extends Comparator<T1>> int doSearch(T1[] objects, T1 key,
			T2 comparator) {
		if (null == key) {
			return INDEX_NOT_FOUND;
		}

		if (comparator == null) {
			if (key instanceof Comparable<?>) {
				Comparable<T1> comparableKey = null;

				try {
					comparableKey = (Comparable<T1>) key;
				} catch (ClassCastException ex) {
					throw ex;
				}

				T1 current = null;
				int result = 0;

				for (int left = 0, right = objects.length - 1, mid = (left + right) / 2; left <= right; mid = (left + right) / 2) {
					current = objects[mid];
					result = comparableKey.compareTo(current);

					if (result == 0) {
						return mid;
					} else if (result < 0) {
						right = mid - 1;					
					} else {
						left = mid + 1;
					}
				}
			} else {
				throw new ClassCastException();
			}			
		} else {
			T1 current = null;
			int result = 0;

			for (int left = 0, right = objects.length - 1, mid = (left + right) / 2; left <= right; mid = (left + right) / 2) {
				current = objects[mid];
				result = comparator.compare(key, current);

				if (result == 0) {
					return mid;
				} else if (result < 0) {
					right = mid - 1;					
				} else {
					left = mid + 1;
				}
			}
		}

		return INDEX_NOT_FOUND;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T1, T2 extends Comparator<T1>> int doSearch(List<T1> objects,
			T1 key, T2 comparator) {
		if (null == key) {
			return INDEX_NOT_FOUND;
		}

		if (comparator == null) {
			if (key instanceof Comparable<?>) {
				Comparable<T1> comparableKey = null;

				try {
					comparableKey = (Comparable<T1>) key;
				} catch (ClassCastException ex) {
					throw ex;
				}

				T1 current = null;
				int result = 0;

				for (int left = 0, right = objects.size() - 1, mid = (left + right) / 2; left <= right; mid = (left + right) / 2) {
					current = objects.get(mid);
					result = comparableKey.compareTo(current);

					if (result == 0) {
						return mid;
					} else if (result < 0) {
						right = mid - 1;					
					} else {
						left = mid + 1;
					}
				}
			} else {
				throw new ClassCastException();
			}			
		} else {
			T1 current = null;
			int result = 0;

			for (int left = 0, right = objects.size() - 1, mid = (left + right) / 2; left <= right; mid = (left + right) / 2) {
				current = objects.get(mid);
				result = comparator.compare(key, current);

				if (result == 0) {
					return mid;
				} else if (result < 0) {
					right = mid - 1;					
				} else {
					left = mid + 1;
				}
			}
		}

		return INDEX_NOT_FOUND;
	}

}
