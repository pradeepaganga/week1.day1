package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int firstnum = 0;
		int secondnum = 1;
		System.out.println("Fibonacci series is as follows:");
		System.out.println(firstnum);
		for (int i = 0; i <= range; i++) {
			int sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.println(sum);

		}

	}

}
