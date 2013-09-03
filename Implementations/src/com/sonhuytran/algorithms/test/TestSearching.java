/**
 * 
 */
package com.sonhuytran.algorithms.test;

import java.util.Comparator;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sonhuytran.algorithms.searching.ISearcher;
import com.sonhuytran.algorithms.test.config.LinearSearchModule;

/**
 * @author Son-Huy TRAN
 * 
 */
public class TestSearching {

	private static Injector configure() {
		return Guice.createInjector(new LinearSearchModule());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Injector injector = TestSearching.configure();
		ISearcher searcher = injector.getInstance(ISearcher.class);

		Integer[] objects = new Integer[] { 3, 1, 9, 5, 7 };
		Integer key1 = 5;
		Integer key2 = 6;

		int result = searcher.search(objects, key1);
		System.out.println(result);

		result = searcher.search(objects, key2);
		System.out.println(result);

		class Comparator1 implements Comparator<Integer> {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		}

		Comparator1 comparator1 = new Comparator1();
		result = searcher.search(objects, key1, comparator1);
		System.out.println(result);

		result = searcher.search(objects, key2, comparator1);
		System.out.println(result);
	}
}
