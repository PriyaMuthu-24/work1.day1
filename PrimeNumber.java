package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		int number = 29;

		// Declare a boolean variable flag as false
		boolean isPrime = true;

		// Iterate from 2 to half of the input
		
	for (int i=2; i<=number/2; i++)
	{
		
		// Divide the input with each for loop variable and check the remainder
		
		if(number % i == 0) {
			
			isPrime =false;
			break;
		}
	}
	
		
	if(isPrime==true)
	{
			System.out.println("number is prime");
	}

	
	else 
	{
		System.out.println("number is not prime");
	}
		// Set the flag as true when there is no remainder

		// break the iterator

		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match

	}

}
