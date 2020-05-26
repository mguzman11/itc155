/*Melissa Guzman
 * ITC 155
 * Midterm
 * May 24, 2020
 */

import java.util.Scanner;

public class DescendingOrder {

	public static void main(String[] args) {
		
		Scanner scnr=new Scanner(System.in);
		int input = scnr.nextInt();
		int i = 0;
		int numElements = 0;
		int [] numbers = new int[10];
		
		while (input != -1) {
			numbers[i] = input;
			i++;
			numElements=i; 
			input = scnr.nextInt();
			}
		
		selectionSortDescendTrace(numbers, numElements);
		
		scnr.close();
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void selectionSortDescendTrace(int[] num, int length) {
        int largest;
        for (int i = 0; i < length - 1; ++i) {
            largest = i;
            for (int j = i; j < length; ++j) {
                if (num[j] > num[largest]) {
                    largest = j;
                }
            }
            swap(num, i, largest);
            for (int j = 0; j < length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
    }
}