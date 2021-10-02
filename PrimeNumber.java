package week1.day1;

public class PrimeNumber {
	
public static void main(String[] args) {
	
    //Declaring Variable
	int prime = 13;
	//Declaring Flag to check prime condition
	boolean flag = false;
	int i = 0;
	//Condition to check prime number 
	for (i = 2; i <= prime / 2; i++) {
		if (prime % i == 0) {
			flag = true;
			break;
		}
	}

	if (flag == false) {
		System.out.println(prime+" is a Prime Number");
	} else
		System.out.println(prime+" is Not a Prime Number");
}
}
