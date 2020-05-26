/*Melissa Guzman
 * ITC 155
 * Midterm Spring 2020
 * May 24, 2020
 */

import java.util.ArrayList;
import java.util.Scanner;


public class PhotoLineUp {

	//Set up Main where the arrayLists will be created
	public static void main(String[] args) {

		//arrayList for the initial names
		ArrayList<String> nameList = new ArrayList<String>();
		//arrayList for the permutation list
		ArrayList<String> permList = new ArrayList<String>();
		//declare variable and data type
		String name;

		//scanner method for user input
		Scanner scnr = new Scanner(System.in);
		System.out.print("input: ");
		name = scnr.next();

		//Read in a list of names; stop when -1 is read.
		while (!name.equals("-1")) {
			nameList.add(name);
			name = scnr.next();
		}
		
		//call the recursive method
		allPermutations(permList, nameList);
		
		//close scanner
		scnr.close();
	}

	//set up recursive method
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

		//initializing local variables
		int i;
		int size = nameList.size();

		// base case
		if (size == 0) {

			for (i = 0; i < permList.size(); ++i) {
				System.out.print(permList.get(i) + " ");
			}
			System.out.println();
			
			
		} else { // recursive case
			for (i = 0; i < size; ++i) {

				// create the arraylist for the premutations
				ArrayList<String> newPerms = new ArrayList<String>(permList);

				// add the items from the namelist to the perms list
				newPerms.add(nameList.get(i));

				// create a new names ararylist
				ArrayList<String> newNames = new ArrayList<String>(nameList);

				// remove the name at current index
				newNames.remove(i);

				// do the same with the new namelist recursively until base case is reached
				allPermutations(newPerms, newNames);
			}
		}
	}
}