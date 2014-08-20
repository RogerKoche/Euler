package com.euler.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.euler.Divisibility;

public class DivisibilityTest {

	@Test
	public void sumOfMultiplesTest() {
		
		int[] multiples = {3,5};
		assertThat(Divisibility.sumOfMultiples(multiples, 10), is(23));
		assertThat(Divisibility.sumOfMultiples(multiples, 1000), is(233168));
	}
	@Test
	public void isDivisibleTest() {
		assertThat("5 divides 10", Divisibility.isDivisible(5, 10), is(true));
		assertThat("3 does not divide 10", Divisibility.isDivisible(3, 10), is(false));
		assertThat("6 divides 36", Divisibility.isDivisible(6, 36), is(true));
		assertThat("7 does not divide 36", Divisibility.isDivisible(7, 36), is(false));
		assertThat("Cannot divide by 0", Divisibility.isDivisible(0, 0), is(false));
		assertThat("Cannot divide by 0", Divisibility.isDivisible(0, 1), is(false));
		assertThat("1 divides 2", Divisibility.isDivisible(1, 2), is(true));
		assertThat("-1 divides 2", Divisibility.isDivisible(-1, 2), is(true));
		assertThat("-1 divides 3", Divisibility.isDivisible(-1, 3), is(true));
		assertThat("-3 divides 9", Divisibility.isDivisible(-3, 9), is(true));
		assertThat("3 divides -9", Divisibility.isDivisible(3, -9), is(true));
	}
}
