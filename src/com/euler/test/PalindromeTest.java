package com.euler.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import com.euler.Palindrome;

public class PalindromeTest {

	@Test
	public void largestPalindromeProductTest() {
		assertThat(Palindrome.largestPalindromeProduct(99,99,10,10), is(9009));
		assertThat(Palindrome.largestPalindromeProduct(99,99), is(9009));
		assertThat(Palindrome.largestPalindromeProduct(999,999,100,100), is(906609));
		assertThat(Palindrome.largestPalindromeProduct(9999999,9999999), is(256434652));
		assertThat(Palindrome.largestPalindromeProduct(999999999,999999999), is(808343808));
		assertThat(Palindrome.largestPalindromeProduct(99,13,90,12), is(0)); //Case where no palindromes exist
		
	}
	@Test
	public void isPalindromeTest() {
		assertThat("9876789 is a palindrome", Palindrome.isPalindrome(9876789), is(true));
		assertThat("9876788 is a palindrome", Palindrome.isPalindrome(9876788), is(false));
	}
	@Test
	public void reverseIntTest() {
		assertThat("54321 reversed is 12345", Palindrome.reverseInt(54321), is(12345));
	}
}
