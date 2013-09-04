/**
 * 
 */
package com.sonhuytran.algorithms.searching.test.config;

import com.google.inject.AbstractModule;
import com.sonhuytran.algorithms.searching.ISearchingAlgorithm;
import com.sonhuytran.algorithms.searching.impl.LinearSearchAlgorithm;

/**
 * @author Son-Huy TRAN
 * 
 */
public class LinearSearchModule extends AbstractModule {

	@Override
	protected void configure() {
		this.bind(ISearchingAlgorithm.class).to(LinearSearchAlgorithm.class);
	}
}
