/*Melissa Guzman
 * ITC 155
 * Assignment 5
 * May 19, 2020
 * 
 * ********************************************************************************
 * 
 * pg 888
 * 
 * #4
 * For this algorithm the complexity class is O(n) because it uses a for loop to go through
 * the entire array, which gives us N. The proceeding 2 statements make it 2N, which 
 * maintains a complexity class of O(n). 
 * 
 * #5
 * For this algorithm the complexity is 1/2(n) because it uses a for loop with 4 
 * statements within the for loop. Even though the loop only uses 1/2 of the array, it
 * is still 1/2N which maintains the complexity class of O(n). 
 * 
 * 
 * #18
 * I believe the run time will be the same since the it is just the opposite of the
 * traditional selection sort algorithm. The complexity class is O(n^2). 
 */

import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
		// Create an array of ints
		int[] nums = { 66, 23, 15, 198, 42, 1 };

		selectionSort(nums);
	}

	// Create the swap method to swap elements in the array
	public static void swap(int[] nums, int i, int j) {

		// initialize the swap
		if (i != j) {
			// set up temporary variables for the swapping
			int temp = nums[i];
			// swap
			nums[i] = nums[j];
			// move element into the next temporary variable
			nums[j] = temp;
		}
	}

	// Create the sorting method
	public static void selectionSort(int[] a) {

		// use recursion to move the largest element to the end of the array
		for (int i = a.length - 1; i >= 0; i--) {
			int largest = i;
			{

				for (int j = i - 1; j >= 0; j--) {
					if (a[j] > a[largest]) {
						largest = j;
					}
				}
				// use swap to set elements in proper order
				swap(a, i, largest);

				// print result
				System.out.println(Arrays.toString(a));

			}

		}

	}
}