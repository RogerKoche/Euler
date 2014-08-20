package com.euler.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.euler.Factor;

public class FactorTest {

	@Test
	public void largestPrimeFactorTest() {
		assertThat(Factor.largestPrimeFactor(13195L), is(29L));
		assertThat(Factor.largestPrimeFactor(600851475143L), is(6857L));
	}
	@Test
	public void primeFactorTest() {
		Long[] pf1 = {5L, 7L, 13L, 29L};
		assertThat("Prime Factors of 13195 are 5,7,13,29", Factor.primeFactors(13195L), is(pf1));
		Long[] pf2 = {71L, 839L, 1471L, 6857L};
		assertThat("Prime Factors of 600851475143 are 71,839,1471,6857", Factor.primeFactors(600851475143L), is(pf2));
	}
}
