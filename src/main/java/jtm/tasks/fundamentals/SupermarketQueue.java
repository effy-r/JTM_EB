package jtm.tasks.fundamentals;

import jtm.activity03.Array;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

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
		if (n == 0) {

			return 0;

		}
		if (n == 1) {
			int sum = 0;
			for (int i : customers) {
				time += i;

			}

			return time;
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println(Arrays.toString(customers) + "," + n);
		
		if (n > 1) {

			int[] array1 = new int[n];
			int minArray1 = customers[0];

			for (int i = 0; i < n; i++) {
				array1[i] = customers[i];

				// copying customers from the first lines
			}
			System.out.println("Newly formed array of lines: " + Arrays.toString(array1));

			for (int i = n; i < customers.length; i++) {

				System.out.println("-!_!_!_!_!_!_!_!_! Start of the 1st loop, turn nr.: " + (i-n+1));
				System.out.println("Array: " + Arrays.toString(array1));
				System.out.println();
				//System.out.println("minValue; time of loop: " + (i-n+1) + " : " + minArray1);
				//System.out.println("The array1; time of the loop:  " + (i-n+1) + " : " + Arrays.toString(array1));

				for (int j = 0; j < array1.length; j++) {
					
					System.out.println("----The start of the second loop");
					System.out.println("turn number " + (j+1));
					
					int array1MinIndex = 0;
					for (int k=0; k<array1.length; k++) {
						
						if (array1[k]==minArray1) {
							array1MinIndex =k;
							break;
						}
						else {
							continue;
						}
					}
					
					System.out.println("---- about the index next 2 lines");
					System.out.println(array1MinIndex);
					System.out.println(ArrayUtils.indexOf(array1, minArray1));
					if (array1[j] == minArray1) {
						System.out.println("The values are the same");
						int g=i++;
						//int array1MinIndex = ArrayUtils.indexOf(array1, minArray1);
						
						array1[j] = minArray1 + customers[i];
						//System.out.println("Value array1[j] is: " + array1[j]);
						System.out.println("customers i+1 = " +customers[i+1] + " where i = " + i );
						array1[array1MinIndex] = minArray1 + customers[g];
						
						System.out.println("array1[j]=" +array1[j] );
						System.out.println("array1[array1MinIndex]=" +array1[array1MinIndex] );
						
						//System.out.println("Value array1[minValue] is: " + array1[array1MinIndex]);
						
						System.out.println();
						
						minArray1 = array1[j];
						
						//System.out.println("The array1 after changing one of the values" + j + Arrays.toString(array1));

						//System.out.println("The minimal value of the array array1 during the ( j=" + j + "; i=" + i
								//+ ") " + minArray1 + "for loop.");
						
						i++;
						
						System.out.println("the i now: " + i);
						System.out.println("Array: " + Arrays.toString(array1));
						System.out.println();
						
						//continue;
					}
					if (array1[j] < minArray1) {
						array1[j] = array1[j] + customers[i];
						minArray1 = array1[j];

						System.out.println("The j>minArray1");
						System.out.println("--------- " + Arrays.toString(array1));
						
						
					}

//					if (array1[j] < ArrayUtils.indexOf(array1, minArray1)) {
//						minArray1 = array1[j];
//						i++;
//						continue;
//					} 
//					else {
//						int array1MinIndex = ArrayUtils.indexOf(array1, minArray1);
//						minArray1 = array1[array1MinIndex];
//					}

				}
				System.out.println("--------- " + Arrays.toString(array1));
				
			}

			System.out.println("--------- Array after all loops" + Arrays.toString(array1));
			for (int i = 0; i < n; i++) {
				if (array1[i] < time) {

					time = array1[i];

				}
				// System.out.println("Time in the loop: " + time);

			}
			// System.out.println("Time after loop: " + time);

			System.out.println("_________________________________________________________");

		}
		return time;
	}
}
