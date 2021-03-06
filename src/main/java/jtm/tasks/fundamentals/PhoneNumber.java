package jtm.tasks.fundamentals;

import java.util.Arrays;

public class PhoneNumber {

	/*
	 * TODO Write a function that accepts an array of 10 integers (between 0 and 9),
	 * that returns a string of those numbers in the form of a phone number.
	 * Example: createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // =>
	 * returns "(123) 456-7890" The returned format must be correct in order to
	 * complete this challenge. Don't forget the space after the closing
	 * parentheses!
	 */

	public static String createPhoneNumber(int[] numbers) {

		// System.out.println(Arrays.toString(numbers));

		System.out.println(Arrays.toString(numbers));
		String a = "(";
		String phoneNumber;

		for (int i = 0; i < numbers.length; i++) {

			if (i<2) {
				a = a + numbers[i];
				continue;
			}
			
			if (i == 2) {
				a = a + numbers[i] + ") ";
				continue;
			}
			if (i<6) {
				a = a + numbers[i];
				continue;
			}
			
			if (i==6) {
				a = a + "-"+numbers[i] ;
				continue;
			}
			if(i>6) {
				a = a +numbers[i] ;
			}

		}
		phoneNumber = a;
		System.out.println(a);
		 
		return phoneNumber;
	}
}
