/**
 * 
 */
package com.sonhuytran.algorithms.searching.test.config;

import com.google.inject.AbstractModule;
import com.sonhuytran.algorithms.searching.ISearchingAlgorithm;
import com.sonhuytran.algorithms.searching.impl.BinarySearchAlgorithm;

/**
 * @author Son-Huy TRAN
 * 
 */
public class BinarySearchModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(ISearchingAlgorithm.class).to(BinarySearchAlgorithm.class);
	}
}
