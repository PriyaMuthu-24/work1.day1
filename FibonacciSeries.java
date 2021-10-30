package week1.day1;

public class FibonacciSeries {

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

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)

		int range = 8, firstNum = 0, secNum = 1, sum;

		// Print first number
		
		System.out.println(firstNum);
		System.out.println(secNum);
		// Iterate from 1 to the range
		
		for (int i=1; i<range; i++) {
			
		

		// add first and second number assign to sum
			
			sum = firstNum + secNum;
			
			// print sum
			
			System.out.println(sum);
		// Assign second number to the first number
			
			 firstNum =secNum ;
			

		// Assign sum to the second number
			
			 secNum = sum;



		
		}
		
		}
	}
