package jtm.tasks.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers1 {
	public static int[] divisibleBy(int[] numbers, int divider) {

		int j = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % divider == 0) {

				j++;
				// continue;

			}

		}

		int[] dividerarray = new int[j];

		System.out.println(Arrays.toString(dividerarray));
		System.out.println("Test1");
		
		int a = 0;

		for (int i = 0; i < numbers.length; i++) {

			
			if (numbers[i] % divider == 0) {

				
				System.out.println("array: " + Arrays.toString(dividerarray));
				System.out.println("____________________");
				System.out.println("a value" + a);
				System.out.println("____________________");
				System.out.println("numbers array: " + numbers[i]);
				System.out.println("____________________");

				dividerarray[a] = numbers[i];
				
				System.out.println("array after changes: " + Arrays.toString(dividerarray));
				System.out.println("____________________");
				

				a++;
				System.out.println("a value fter changes: " + a);
				System.out.println("____________________");
				continue;

			} if (numbers[i] % divider != 0) {
				continue;
			}

		}
		System.out.println(Arrays.toString(dividerarray));

		return dividerarray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EvenNumbers1 uno = new EvenNumbers1();

		int[] array = { 1, 2, 3, 4, 5, 6 };
		divisibleBy(array, 2);

		// System.out.println(Arrays.toString(divisibleBy(array, 2)));

	}

}
