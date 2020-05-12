/* Melissa Guzman
 * ITC 155
 * Assignment 5
 * May 12, 2020
 */
public class writeNums {

	public static void main(String[] args) {

		// initialize the variable
		//will print 1, 2, 3, 4, 5
		int n = 5;
		
		//will print 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		//int n= 12;
		
		//will throw error stating to select a number >=1
		//int n= 0;    

		// call the method
		writeNums(n);

	}

	public static void writeNums(int n) {
		
		//set up recursion if/else if/else statement

		//accounts for numbers less than 1
		if (n < 1) {
			throw new IllegalArgumentException("can't be less than 1.");
			
			
		} else if (n == 1) {                //base case
			System.out.print(1);            //prints base case to finish the sequence
		}

		else {
			writeNums(n - 1);              //recursively calls the method
			System.out.print( ", " + n);   //prints the sequence
		}

	}

}
