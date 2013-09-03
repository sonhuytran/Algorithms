/**
 * 
 */
package com.sonhuytran.algorithms.test.config;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sonhuytran.algorithms.searching.ISearchingAlgorithm;
import com.sonhuytran.algorithms.searching.impl.LinearSearchAlgorithm;

/**
 * @author Son-Huy TRAN
 * 
 */
public class LinearSearchModule implements Module {

	@Override
	public void configure(Binder binder) {
		binder.bind(ISearchingAlgorithm.class).to(LinearSearchAlgorithm.class);
	}
}
