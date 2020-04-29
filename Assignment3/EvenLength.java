
/*Melissa Guzman
 * ITC 155
 * Assignment 3
 * April 28, 2020
 */
import java.util.*;

public class EvenLength {

	public static void main(String[] args) {

		// construct arraylist and fill it
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

		// call the method
		EvenLength(list);

	}

	private static void EvenLength(ArrayList<String> list) {

		// Set up for loop to remove evens
		for (int i = list.size() - 2; i >= 0; i -= 2) {
			list.remove(i);
		}

		// check to see if evens were removed.
		System.out.println(list);
	}
}