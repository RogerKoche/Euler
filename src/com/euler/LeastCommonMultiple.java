package com.euler;

public class LeastCommonMultiple {

	/** Problem 5: Smallest Multiple
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	
	/**
	 * Calculates the smallest positive number that is evenly divisible by all numbers from 1 to max.
	 * @param max The upper bound of the range
	 * @return The least common multiple of all numbers from 1 to max
	 */
	public static long smallestMultiple(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("Max must be positive");
		}
		long result = 1;
		for (int i = 2; i <= max; i++) {
			result = lcm(result, i);
		}
		return result;
	}
	
	/**
	 * Calculates the least common multiple of two numbers.
	 * @param a First number
	 * @param b Second number
	 * @return The least common multiple of a and b
	 */
	public static long lcm(long a, long b) {
		if (a == 0 || b == 0) {
			return 0;
		}
		return Math.abs(a * b) / gcd(a, b);
	}
	
	/**
	 * Calculates the least common multiple of an array of numbers.
	 * @param numbers Array of numbers
	 * @return The least common multiple of all numbers in the array
	 */
	public static long lcmOfArray(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Array must not be empty");
		}
		long result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			result = lcm(result, numbers[i]);
		}
		return result;
	}
	
	/**
	 * Calculates the greatest common divisor of two numbers using Euclidean algorithm.
	 * @param a First number
	 * @param b Second number
	 * @return The greatest common divisor of a and b
	 */
	public static long gcd(long a, long b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
