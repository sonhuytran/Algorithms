/**
 * 
 */
package com.sonhuytran.algorithms.searching.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sonhuytran.algorithms.searching.ISearcher;
import com.sonhuytran.algorithms.searching.impl.AbstractSearchingAlgorithm;
import com.sonhuytran.algorithms.searching.test.config.BinarySearchModule;

/**
 * @author Son-Huy TRAN
 * 
 */
public class BinarySearchTest {
	private Injector injector = null;
	private ISearcher searcher = null;
	private IntegerComparator comparator = null;

	@BeforeClass
	private void configure() {
		System.out.println("Pre-init");
		this.injector = Guice.createInjector(new BinarySearchModule());
		this.searcher = injector.getInstance(ISearcher.class);
		this.comparator = new IntegerComparator();
	}

	@Test
	public void test1() {
		Integer[] objects = new Integer[] { 1, 3, 5, 7, 9 };
		Integer key1 = 7;
		Integer key2 = 1;
		Integer key3 = 9;
		Integer key4 = 6;
		Integer key5 = 10;

		Assert.assertEquals(searcher.search(objects, key1), 3);
		Assert.assertEquals(searcher.search(objects, key2), 0);
		Assert.assertEquals(searcher.search(objects, key3), 4);
		Assert.assertEquals(searcher.search(objects, key4),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
		Assert.assertEquals(searcher.search(objects, key5),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
	}

	@Test
	public void test2() {
		Integer[] objects = new Integer[] { 1, 3, 5, 7, 9 };
		Integer key1 = 7;
		Integer key2 = 1;
		Integer key3 = 9;
		Integer key4 = 6;
		Integer key5 = 10;

		Assert.assertEquals(searcher.search(objects, key1, this.comparator), 3);
		Assert.assertEquals(searcher.search(objects, key2, this.comparator), 0);
		Assert.assertEquals(searcher.search(objects, key3, this.comparator), 4);
		Assert.assertEquals(searcher.search(objects, key4, this.comparator),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
		Assert.assertEquals(searcher.search(objects, key5, this.comparator),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
	}

	@Test
	public void test3() {
		Integer[] array = new Integer[] { 1, 3, 5, 7, 9 };
		List<Integer> objects = Arrays.asList(array);

		Integer key1 = 7;
		Integer key2 = 1;
		Integer key3 = 9;
		Integer key4 = 6;
		Integer key5 = 10;

		Assert.assertEquals(searcher.search(objects, key1), 3);
		Assert.assertEquals(searcher.search(objects, key2), 0);
		Assert.assertEquals(searcher.search(objects, key3), 4);
		Assert.assertEquals(searcher.search(objects, key4),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
		Assert.assertEquals(searcher.search(objects, key5),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
	}

	@Test
	public void test4() {
		Integer[] array = new Integer[] { 1, 3, 5, 7, 9 };
		List<Integer> objects = Arrays.asList(array);

		Integer key1 = 7;
		Integer key2 = 1;
		Integer key3 = 9;
		Integer key4 = 6;
		Integer key5 = 10;

		Assert.assertEquals(searcher.search(objects, key1, this.comparator), 3);
		Assert.assertEquals(searcher.search(objects, key2, this.comparator), 0);
		Assert.assertEquals(searcher.search(objects, key3, this.comparator), 4);
		Assert.assertEquals(searcher.search(objects, key4, this.comparator),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
		Assert.assertEquals(searcher.search(objects, key5, this.comparator),
				AbstractSearchingAlgorithm.INDEX_NOT_FOUND);
	}

	private static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer i, Integer j) {
			return i.compareTo(j);
		}
	}
}
