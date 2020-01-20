package jtm.tasks.fundamentals;

import java.util.Arrays;

public class SupermarketQueue {

	/*
	 * TODO There is a queue for the self-checkout tills at the supermarket. Your
	 * task is write a function to calculate the total time required for all the
	 * customers to check out!
	 * 
	 * Input: customers: an array of positive integers representing the queue. Each
	 * integer represents a customer, and its value is the amount of time they
	 * require to check out. n: a positive integer, the number of checkout tills.
	 * Output The function should return an integer, the total time required.
	 * 
	 * Examples: queueTime([5,3,4], 1) => should return 12 Because when there is 1
	 * till, the total time is just the sum of the times
	 * 
	 * queueTime([10,2,3,3], 2) => should return 10 Because here n=2 and the 2nd,
	 * 3rd, and 4th people in the queue finish before the 1st person has finished.
	 * 
	 * queueTime([2,3,10], 2) => should return 12
	 * 
	 */

	public static int solveSuperMarketQueue(int[] customers, int n) {

		System.out.println(Arrays.toString(customers) + "," + n);

		int time = 0;

		if (customers.length == 0) {

			return 0;
		}
		else if (n == 0) {

			return 0;

		}
		else if (n == 1) {

			for (int i : customers) {
				time += i;

			}

			return time;
		}

		else if (n > 1) {

			int[] array1 = new int[n];
			int minArray1 = customers[0];
			int array1MinIndex = 0;
			int equalValues = 0;

			for (int i = 0; i < n; i++) {
				array1[i] = customers[i];

				// copying customers from the first lines
			}

			// going trough all the customers
			for (int i = n; i < customers.length; i++) {

				// finding min value
				for (int k = 0; k < array1.length; k++) {

					if (minArray1 > array1[k]) {

						minArray1 = array1[k];

						break;

					}
				}

				// the index of minimal value
				for (int k = 0; k < array1.length; k++) {

					if (array1[k] == minArray1) {
						array1MinIndex = k;
						equalValues++;
						continue;

					}
				}

				// going trough the array1 values
				for (int j = 0; j < array1.length; j++) {

					// if the values are the same in array1
					if (array1[j] == minArray1) {

						for (int k = 0; k < equalValues; k++) {

							array1[k] = minArray1 + customers[i];

							i++;

						}
						minArray1 = array1[j];

						continue;
					}

					// if there is a smaler value in the array
					if (array1[j] > minArray1) {

						array1[array1MinIndex] = array1[array1MinIndex] + customers[i];

						minArray1 = array1[j];

					}

				}

			}

			System.out.println("End of loop array:" + Arrays.toString(array1));
			for (int i = 0; i < n; i++) {
				if (array1[i] > time) {

					time = array1[i];

				}

			}
			System.out.println("Time after loop: " + time);

		}
		return time;
	}
}
