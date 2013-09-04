package com.sonhuytran.algorithms.searching.impl;

import java.util.Comparator;
import java.util.List;

public class LinearSearchAlgorithm extends AbstractSearchingAlgorithm {

	@Override
	public <T> int doSearch(T[] objects, T key) {
		return doSearch(objects, key, null);
	}

	@Override
	public <T> int doSearch(List<T> objects, T key) {
		return doSearch(objects, key, null);
	}

	@Override
	public <T1, T2 extends Comparator<T1>> int doSearch(T1[] objects, T1 key,
			T2 comparator) {
		if (null == key) {
			return INDEX_NOT_FOUND;
		}

		if (comparator == null) {
			for (int i = 0; i < objects.length; i++) {
				if (key.equals(objects[i])) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < objects.length; i++) {
				if (comparator.compare(objects[i], key) == 0) {
					return i;
				}
			}
		}

		return INDEX_NOT_FOUND;
	}

	@Override
	public <T1, T2 extends Comparator<T1>> int doSearch(List<T1> objects,
			T1 key, T2 comparator) {
		if (null == key) {
			return INDEX_NOT_FOUND;
		}

		if (comparator == null) {
			for (int i = 0; i < objects.size(); i++) {
				if (key.equals(objects.get(i))) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < objects.size(); i++) {
				if (comparator.compare(objects.get(i), key) == 0) {
					return i;
				}
			}
		}

		return INDEX_NOT_FOUND;
	}

}
