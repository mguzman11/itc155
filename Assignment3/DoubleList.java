
/*Melissa Guzman
 * ITC 155
 * Assignment 3
 * April 28, 2020
 */
import java.util.*;

public class DoubleList {

	public static void main(String[] args) {

		// construct arraylist and fill it
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

		// call the method
		DoubleList(list);

	}

	private static void DoubleList(ArrayList<String> list) {

		// Set up for loop to create doubles
		for (int i = list.size() - 1; i >= 0; i--) {
			String s = list.get(i);
			list.add(i, s);
		}

		// check to see if double words were added.
		System.out.println(list);

	}
}