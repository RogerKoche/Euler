package com.euler.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.euler.LeastCommonMultiple;

public class LeastCommonMultipleTest {

	@Test
	public void gcdTest() {
		assertThat("GCD of 12 and 8 is 4", LeastCommonMultiple.gcd(12, 8), is(4L));
		assertThat("GCD of 48 and 18 is 6", LeastCommonMultiple.gcd(48, 18), is(6L));
		assertThat("GCD of 7 and 13 is 1", LeastCommonMultiple.gcd(7, 13), is(1L));
		assertThat("GCD of 100 and 50 is 50", LeastCommonMultiple.gcd(100, 50), is(50L));
		assertThat("GCD of 1 and 1 is 1", LeastCommonMultiple.gcd(1, 1), is(1L));
		assertThat("GCD of 0 and 5 is 5", LeastCommonMultiple.gcd(0, 5), is(5L));
		assertThat("GCD of 5 and 0 is 5", LeastCommonMultiple.gcd(5, 0), is(5L));
		assertThat("GCD handles negative numbers", LeastCommonMultiple.gcd(-12, 8), is(4L));
		assertThat("GCD handles negative numbers", LeastCommonMultiple.gcd(12, -8), is(4L));
		assertThat("GCD handles both negative numbers", LeastCommonMultiple.gcd(-12, -8), is(4L));
	}
	
	@Test
	public void lcmTest() {
		assertThat("LCM of 4 and 6 is 12", LeastCommonMultiple.lcm(4, 6), is(12L));
		assertThat("LCM of 12 and 8 is 24", LeastCommonMultiple.lcm(12, 8), is(24L));
		assertThat("LCM of 7 and 13 is 91", LeastCommonMultiple.lcm(7, 13), is(91L));
		assertThat("LCM of 3 and 5 is 15", LeastCommonMultiple.lcm(3, 5), is(15L));
		assertThat("LCM of 1 and 1 is 1", LeastCommonMultiple.lcm(1, 1), is(1L));
		assertThat("LCM of 1 and any number is that number", LeastCommonMultiple.lcm(1, 100), is(100L));
		assertThat("LCM of 0 and any number is 0", LeastCommonMultiple.lcm(0, 5), is(0L));
		assertThat("LCM handles negative numbers", LeastCommonMultiple.lcm(-4, 6), is(12L));
		assertThat("LCM of 21 and 6 is 42", LeastCommonMultiple.lcm(21, 6), is(42L));
	}
	
	@Test
	public void lcmOfArrayTest() {
		int[] arr1 = {4, 6, 8};
		assertThat("LCM of [4,6,8] is 24", LeastCommonMultiple.lcmOfArray(arr1), is(24L));
		
		int[] arr2 = {2, 3, 4, 5};
		assertThat("LCM of [2,3,4,5] is 60", LeastCommonMultiple.lcmOfArray(arr2), is(60L));
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		assertThat("LCM of [1..10] is 2520", LeastCommonMultiple.lcmOfArray(arr3), is(2520L));
		
		int[] arr4 = {7, 13, 17};
		assertThat("LCM of prime numbers [7,13,17] is their product", LeastCommonMultiple.lcmOfArray(arr4), is(1547L));
		
		int[] arr5 = {10};
		assertThat("LCM of single element is the element itself", LeastCommonMultiple.lcmOfArray(arr5), is(10L));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void lcmOfArrayThrowsExceptionForEmptyArray() {
		int[] arr = {};
		LeastCommonMultiple.lcmOfArray(arr);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void lcmOfArrayThrowsExceptionForNullArray() {
		LeastCommonMultiple.lcmOfArray(null);
	}
	
	@Test
	public void smallestMultipleTest() {
		// Test case from problem statement: numbers 1 to 10
		assertThat("Smallest multiple of 1 to 10 is 2520", 
				LeastCommonMultiple.smallestMultiple(10), is(2520L));
		
		// Solution to Problem 5: numbers 1 to 20
		assertThat("Smallest multiple of 1 to 20 is 232792560", 
				LeastCommonMultiple.smallestMultiple(20), is(232792560L));
		
		// Edge cases
		assertThat("Smallest multiple of 1 to 1 is 1", 
				LeastCommonMultiple.smallestMultiple(1), is(1L));
		
		assertThat("Smallest multiple of 1 to 2 is 2", 
				LeastCommonMultiple.smallestMultiple(2), is(2L));
		
		assertThat("Smallest multiple of 1 to 3 is 6", 
				LeastCommonMultiple.smallestMultiple(3), is(6L));
		
		assertThat("Smallest multiple of 1 to 4 is 12", 
				LeastCommonMultiple.smallestMultiple(4), is(12L));
		
		assertThat("Smallest multiple of 1 to 5 is 60", 
				LeastCommonMultiple.smallestMultiple(5), is(60L));
		
		assertThat("Smallest multiple of 1 to 6 is 60", 
				LeastCommonMultiple.smallestMultiple(6), is(60L));
		
		assertThat("Smallest multiple of 1 to 7 is 420", 
				LeastCommonMultiple.smallestMultiple(7), is(420L));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void smallestMultipleThrowsExceptionForZero() {
		LeastCommonMultiple.smallestMultiple(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void smallestMultipleThrowsExceptionForNegative() {
		LeastCommonMultiple.smallestMultiple(-5);
	}
}
