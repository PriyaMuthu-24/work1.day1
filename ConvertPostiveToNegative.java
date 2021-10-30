package week1.day1;

public class ConvertPostiveToNegative {

	public static void main(String[] args) {

		int number = -90;

		int positiveNumber;

		if (number < 0) {
			positiveNumber = number * (-1);

			System.out.println( "Negative to positive number is " + positiveNumber);

		}

		else

			System.out.println("Number is already positive number " + number);

	}

}
