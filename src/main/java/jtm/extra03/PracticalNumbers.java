package jtm.extra03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticalNumbers {

	// TODO Read article https://en.wikipedia.org/wiki/Practical_number
	// Implement method, which returns practical numbers in given range
	// including
	public String getPracticalNumbers(int from, int to) {

		// is a positive integer n such that all smaller positive integers can be
		// represented as sums of distinct divisors of n. For example, 12 is a practical
		// number because all the numbers from 1 to 11 can be expressed as sums of its
		// divisors 1, 2, 3, 4, and 6: as well as these divisors themselves, we have 5 =
		// 3 + 2, 7 = 6 + 1, 8 = 6 + 2, 9 = 6 + 3, 10 = 6 + 3 + 1, and 11 = 6 + 3 + 2.

		// uztaisajm array listu, lai uzgalabatu informaciju

		System.out.println("from" + from);
		System.out.println("to" + to);

		List<Integer> primeNumbers = new ArrayList<Integer>();

		List<Integer> practicalNumbers = new ArrayList<Integer>();

		// Create a list of prime numbers

		for (int i = 1; i <= to; i++) {

			if (i % 2 != 0) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					} else {
						primeNumbers.add(i);
						break;
					}
				}
			}
		}

		System.out.println("The prime numbers + " + Arrays.toString(primeNumbers.toArray())); 
		
		while (from <= to) {

			List<Integer> myList = new ArrayList<Integer>();

			int sum = 1;

			for (int j = 1; j <= from; j++) {

				if (from % j == 0) {

					myList.add(j);

				}

			}
			System.out.println("The divisors of " + from + Arrays.toString(myList.toArray()));

			for (int k = 0; k < myList.size(); k++) {

				sum = sum + myList.get(k);

			}

			if ((sum) >= (2*from)) {
				
				int n=1;
			
				for (int i=1; i<from; i++) {
					
					//int n = 1;
					
					for (int j =0; j<myList.size(); j++) {
						if (n % myList.get(j)==0) {
							n++;
							break;
						}
						//if else (n-)
					}
					//n++;
				}
				if (n==from) {

				practicalNumbers.add(from);
				}
			}
			from++;
		}

		System.out.println("Practical numbers " + Arrays.toString(practicalNumbers.toArray()));
		// myList.toArray();

		return Arrays.toString(practicalNumbers.toArray());

	}
}
