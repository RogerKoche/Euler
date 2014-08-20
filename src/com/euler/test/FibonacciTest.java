package com.euler.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.euler.Divisibility;
import com.euler.Fibonacci;

public class FibonacciTest {

	@Test
	public void sumOfMultiplesTest() {
		
		assertThat(Fibonacci.sumOfFibonacciNumbers(90), is(231));
		assertThat(Fibonacci.sumOfFibonacciNumbers(4000000,2), is(4613732));
	}
	@Test
	public void fibonacciRecursionTest() {
		assertThat("Fibonacci 0 is undefined", Fibonacci.fibonacciRecursion(0), is(0));
		assertThat("Fibonacci 1 is 1", Fibonacci.fibonacciRecursion(1), is(1));
		assertThat("Fibonacci 2 is 2", Fibonacci.fibonacciRecursion(2), is(2));
		assertThat("Fibonacci 3 is 3", Fibonacci.fibonacciRecursion(3), is(3));
		assertThat("Fibonacci 4 is 5", Fibonacci.fibonacciRecursion(4), is(5));
		assertThat("Fibonacci 5 is 8", Fibonacci.fibonacciRecursion(5), is(8));
		assertThat("Fibonacci 6 is 13", Fibonacci.fibonacciRecursion(6), is(13));
		assertThat("Fibonacci 7 is 21", Fibonacci.fibonacciRecursion(7), is(21));
		assertThat("Fibonacci 8 is 34", Fibonacci.fibonacciRecursion(8), is(34));
		assertThat("Fibonacci 9 is 55", Fibonacci.fibonacciRecursion(9), is(55));
		assertThat("Fibonacci 10 is 89", Fibonacci.fibonacciRecursion(10), is(89));
	}
}
