package jtm.activity03;

import java.util.Arrays;

public class Array {
	static int[] array;

	// }

	public static void main(String[] args) {

		System.out.println(Arrays.toString(args));

		array = new int[args.length];
		// int array1[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {

			array[i] = Integer.parseInt(args[i]);

		}
		// Array.array = new array1[args.length];

		Arrays.sort(array);
		printSortedArray();
		returnSortedArray();
		// System.out.println(Arrays.toString(array1));

		// TODO Use passed parameters for main method to initialize array
		// Hint: use Run— Run configurations... Arguments to pass parameters to
		// main method when calling from Eclipse
		// Sort elements in this array in ascending order
		// Hint: use Integer.parseInt(args[n]) to convert passed
		// parameters from String to int
		// Hint: use Arrays.sort(...) from
		// https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
		// START

		// END
	}

	public static void printSortedArray() {
		// TODO print content of array on standard output
		// Hint: use Arrays.toString(array) method for this
		// START

		// System.out.println("abcd");
		System.out.println(Arrays.toString(Array.array));

		// END
	}

	public static int[] returnSortedArray() {
		// TODO return reference to this array
		// START

		// END
		return Array.array;
	}

}
