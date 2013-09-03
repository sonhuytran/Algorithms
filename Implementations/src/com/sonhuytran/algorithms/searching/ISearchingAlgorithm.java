/**
 * 
 */
package com.sonhuytran.algorithms.searching;

import java.util.Comparator;
import java.util.List;

/**
 * @author Son-Huy TRAN
 * 
 */
public interface ISearchingAlgorithm {
	<T> int doSearch(T[] objects, T key);

	<T> int doSearch(List<T> objects, T key);

	<T1, T2 extends Comparator<T1>> int doSearch(T1[] Objects, T1 key,
			T2 comparator);

	<T1, T2 extends Comparator<T1>> int doSearch(List<T1> Objects, T1 key,
			T2 comparator);
}
