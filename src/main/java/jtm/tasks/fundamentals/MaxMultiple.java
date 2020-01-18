package jtm.tasks.fundamentals;

public class MaxMultiple {

	/*
	 * TODO Given a Divisor and a Bound , Find the largest integer N , Such That ,
	 * Conditions : N is divisible by divisor N is less than or equal to bound N is
	 * greater than 0.
	 * 
	 * Example: For divisor = 3 and bound = 10, the output should be
	 * maxMultiple(divisor, bound) = 9.
	 * 
	 * The largest integer divisible by 3 and not larger than 10 is 9.
	 * 
	 * The parameters (divisor, bound) passed to the function are only positve
	 * values . It's guaranteed that a divisor is Found .
	 * 
	 * maxMultiple (2,7) ==> return (6) (6) is divisible by (2) , (6) is less than
	 * or equal to bound (7) , and (6) is > 0 .
	 * 
	 * maxMultiple (10,50) ==> return (50) (50) is divisible by (10) , (50) is less
	 * than or equal to bound (50) , and (50) is > 0 .*
	 * 
	 * maxMultiple (37,200) ==> return (185) (185) is divisible by (37) , (185) is
	 * less than or equal to bound (200) , and (185) is > 0 .
	 * 
	 * 
	 */
	public static int maxMultiple(int divisor, int bound) {
		// Your code here

		if (divisor > 0 & bound > 0) {

			int N=0;
			int n = bound;

			while ((n <= bound) & (n > 0)) {

				if (n % divisor == 0) {
					N = n;
					break;
				}
				n--;

			}

			return N;
		} else {
			return -1;
		}
	}
}
