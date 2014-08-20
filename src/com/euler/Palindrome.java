package com.euler;

public class Palindrome {

	/** Problem 4: Largest Palindrome Product
	 * A palindromic number reads the same both ways.
	 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */

	public static int largestPalindromeProduct(int max1, int max2, int min1, int min2){
		int maxProduct = max1*max2;
		int minProduct = min1*min2;
		for (int i = maxProduct; i>=minProduct; i--){
			if (isPalindrome(i)){
				for (int j = max1; j>=min1; j--){
					if ((i%j==0)&&(i/j<=max2)&&(i/j>=min2)){
						return i;
					}
				}
			}
		}
		return 0; //Returns 0 if no palindrome is found
	}
	
	public static int largestPalindromeProduct(int max1, int max2){
		return largestPalindromeProduct(max1,max2,1,1);
	}

	public static boolean isPalindrome(int input) {
		return (input == reverseInt(input))? true:false;
	}
	
	public static int reverseInt(int input){
		int reverse = 0;
		while (input != 0) {
			int remainder = input % 10;
			reverse = reverse * 10 + remainder;
			input = input / 10;
		}
		return reverse;
	}
}
