/**
 * 
 */
package com.sonhuytran.algorithms.searching;

/**
 * @author Son-Huy TRAN
 * 
 */
public class SHSearcher {
	public static final int NOT_FOUND = -1;

	public static int linearSearch(Object[] inputs, Object key) {
		for (int i = 0; i < inputs.length; i++) {
			if (inputs[i].equals(key)) {
				return i;
			}
		}

		return NOT_FOUND;
	}
}
