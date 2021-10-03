package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code? 1) 2) 3)
		 * 
		 */
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int range = 8;
		int firstnum = 0;
		int secnum = 1;
		int sum = 0;
		// Print first number
		System.out.println("Fibonacci series is as follows:");
		System.out.println(firstnum);
		// Iterate from 1 to the range
		for (int i = 1; i < range; ++i) {
			if (i <= 1)
				sum = i;
			else {

				// add first and second number assign to sum
				sum = firstnum + secnum;
				// Assign second number to the first number
				firstnum = secnum;
				// Assign sum to the second number
				secnum = sum;
			}
			System.out.println(sum);
		}
		// print sum

	}

}
