/**
 * 
 */
package com.sonhuytran.algorithms.searching;

import java.util.Comparator;
import java.util.List;

import com.google.inject.ImplementedBy;
import com.sonhuytran.algorithms.searching.impl.Searcher;

@ImplementedBy(Searcher.class)
/**
 * @author Son-Huy TRAN
 * 
 */
public interface ISearcher {
	<T> int search(T[] objects, T key);

	<T> int search(List<T> objects, T key);

	<T1, T2 extends Comparator<T1>> int search(T1[] Objects, T1 key,
			T2 comparator);

	<T1, T2 extends Comparator<T1>> int search(List<T1> Objects, T1 key,
			T2 comparator);
}
