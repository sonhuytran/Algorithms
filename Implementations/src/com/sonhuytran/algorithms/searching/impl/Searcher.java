/**
 * 
 */
package com.sonhuytran.algorithms.searching.impl;

import java.util.Comparator;
import java.util.List;

import com.google.inject.Inject;
import com.sonhuytran.algorithms.searching.ISearcher;
import com.sonhuytran.algorithms.searching.ISearchingAlgorithm;

/**
 * @author Son-Huy TRAN
 * 
 */
public class Searcher implements ISearcher {

	private ISearchingAlgorithm algorithm;

	@Inject
	public Searcher(ISearchingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	@Override
	public <T> int search(T[] objects, T key) {
		return algorithm.doSearch(objects, key);
	}

	@Override
	public <T> int search(List<T> objects, T key) {
		return algorithm.doSearch(objects, key);
	}

	@Override
	public <T1, T2 extends Comparator<T1>> int search(T1[] objects, T1 key,
			T2 comparator) {
		return algorithm.doSearch(objects, key, comparator);
	}

	@Override
	public <T1, T2 extends Comparator<T1>> int search(List<T1> objects,
			T1 key, T2 comparator) {
		return algorithm.doSearch(objects, key, comparator);
	}
}