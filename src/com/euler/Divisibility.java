package com.euler;

public class Divisibility {

	/** Problem 1: Multiples of 3 and 5
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
	 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	
	public static int sumOfMultiples(int[] multiples, int max) {
		int sum = 0;
		for (int i=0; i<max; i++){
			for (int j=0; j<multiples.length; j++){
				if (isDivisible(multiples[j], i)){
					sum+=i;
					break;
				}
			}
		}
		return sum;
	}
	
	public static boolean isDivisible(int divisor, int dividend) {
		if (divisor==0){
			return false;
		}
		return (dividend%divisor==0)? true:false;
	}
}
