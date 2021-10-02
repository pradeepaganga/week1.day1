package week1.day1;

public class Factorial {

	public static void main(String[] args) {

		int fact = 5;
		int i = 1;
		int factorial = 1;
		//Iterating for factorial of the given number
		while (i <= fact) {
			factorial = factorial * i;
			i++;
		}

		System.out.println("Factorial of " +fact+ " is:"+ factorial);
	}
}
