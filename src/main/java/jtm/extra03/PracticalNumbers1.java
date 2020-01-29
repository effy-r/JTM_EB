package jtm.extra03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticalNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> practicalNumbers = new ArrayList<Integer>();

		int from = 1;
		int to = 10;

		while (from <= to) {

			List<Integer> myList = new ArrayList<Integer>();

			int sum = 1;
			int differentSum =0;

			for (int j = 1; j <= from; j++) {

				if (from % j == 0) {

					myList.add(j);

				}

			}

			// 2^r is a member for all r as every number < = sigma(2^r) = 2^(r+1)-1 is a sum
			// of a distinct subset of divisors {1, 2, 2^2, ..., 2^m}. - Amarnath Murthy,
			// Apr 23 2004
			
			
			System.out.println("Divisors:" + Arrays.toString(myList.toArray()));

			for (int k = 0; k < myList.size(); k++) {

				sum = sum + myList.get(k);
				differentSum = (int) (differentSum + Math.pow(2, k));

			}
			
			
			System.out.println("~~~~~~~~" + differentSum);
			
			System.out.println("~!~!~!~!~!" + sum);
			if ((sum + 1) >= (2 * from)) {

				practicalNumbers.add(from);
			}
			from++;
		}

		System.out.println(Arrays.toString(practicalNumbers.toArray()));
		// myList.toArray();
	}

}
