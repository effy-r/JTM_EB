package jtm.tasks.fundamentals;

import java.util.Arrays;

public class DiceHistogram {

	/*
	 * TODO A 6-sided die is rolled a number of times and the results are plotted as
	 * a character-based histogram.
	 * 
	 * You will be passed the dice value frequencies, and your task is to write the
	 * code to return a string representing a histogram, so that when it is printed
	 * it has the same format as the example.
	 * 
	 * 
	 * There are no trailing spaces on the lines All lines (including the last) end
	 * with a newline \n A count is displayed beside each bar except where the count
	 * is 0 The number of rolls may vary but there are never more than 100
	 * 
	 * Example: [7,3,10,1,0,5] => 
	 * 6|##### 5 
	 * 5| 
	 * 4|# 1 
	 * 3|########## 10 
	 * 2|### 3
	 * 1|####### 7
	 */
	public static String histogram(final int results[]) {

		System.out.println(Arrays.toString(results));

		String line1 = "";

		for (int i = (results.length - 1); i >= 0; i--) {

			line1 = line1 + (i + 1) + "|";

			for (int j = 0; j < results[i]; j++) {
				line1 = line1 + "#";
				// System.out.println(line);

				if (j == (results[i] - 1)) {
					line1 = line1  + " " + results[i] +'\n' ;
				}

			}

			if (results[i] == 0) {
				line1 = line1 + '\n';
			}
		}
		System.out.println("");
		System.out.println(line1);

		return line1;
	}

}
