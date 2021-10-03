package week1.day1;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int Input = 13;
		// Declare a boolean variable flag as false
		boolean flag = false;
		int i = 0;
		// Iterate from 2 to half of the input

		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator
		for (i = 2; i <= Input / 2; i++) {
			if (Input % i == 0) {
				flag = true;
				break;
			}
		}
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		if (flag == false) {
			System.out.println(Input + " is a Prime Number");
		} else
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println(Input + " is Not a Prime Number");
	}
}
