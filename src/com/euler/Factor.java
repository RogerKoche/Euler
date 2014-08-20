package com.euler;

import java.util.Set;
import java.util.TreeSet;

public class Factor {

	/** Problem 3: Largest Prime Factor
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 */

	public static long largestPrimeFactor(long input){
		Long[] pf = primeFactors(input);
		for (int i=0; i<pf.length; i++){
			//System.out.println(pf[i]);
		}
		return pf[pf.length-1];
	}

	public static Long[] primeFactors(long input){
		Set<Long> primeFactors = new TreeSet<>();
		long copy = input;
		for (long i = 2; i <= copy; i++) {
			if (copy % i == 0) {
				primeFactors.add(i);
				copy /= i;
				i--;
			}
		}
		return primeFactors.toArray(new Long[0]);
	}
}
