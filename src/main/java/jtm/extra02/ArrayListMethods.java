package jtm.extra02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	List<Integer> myList = new ArrayList<Integer>();
	List<Integer> newList = new ArrayList<Integer>();

	public List<Integer> checkArray(int comparator, int... numbers) {

		for (int i = 0; i < myList.size(); i++) {

			if (myList.get(i) < comparator) {

				for (int j = 0; j < myList.size(); j++) {

					newList.set(j, myList.get(i));

				}

			}
			// TODO #1:Implement method that compares values of passed array with
			// passed comparator.
			// Return list with values that are smaller than comparator.
			// Hint: Investigate how varargs are used.

		}
		return newList;
	}

	public int sumResult() {
		int sum = 0;
		// TODO #2: Count element sum of the list

		for (int i = 0; i < newList.size(); i++) {
			
			sum = sum + newList.get(i);

		}
		return sum;
	}
}
