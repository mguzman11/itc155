/*Melissa Guzman
 * ITC 155
 * Assignment 4
 * May 5, 2020
 */


import java.util.*;

public class IsUnique {
	
	public static void main(String[] args) {
	
		// create Map that has no duplicates
		Map<String, String> names1 = new HashMap<>();
		names1.put("Marty", "Stepp");
		names1.put("Stuart", "Reges");
		names1.put("Jessica", "Miller");
		names1.put("Amanda", "Camp");
		names1.put("Hal", "Perkins");

		//create Map that has duplicates
		Map<String, String> names2 = new HashMap<>();
		names2.put("Kendrick", "Perkins");
		names2.put("Stuart", "Reges");
		names2.put("Jessica", "Miller");
		names2.put("Bruce", "Reges");
		names2.put("Hal", "Perkins");

		// checking to see if the Map was created (for my use)
		//System.out.println(names1);
		//System.out.println(names2);
		
		//Call method
		System.out.println(isUnique(names1));
		System.out.println(isUnique(names2));
	}
	
	//is Unique tests if a map has unique values
	public static boolean isUnique(Map <String, String> map) {
		
		//create a set to hold the values
		Set<String> values = new HashSet();
		
		//iterate over the values in the map
		for(String value : map.values()) {
			
			
			if(values.contains(value)) {
				
				return false; //the value is a duplicate
				
			} else {
				
				//add value from the map to the set
				values.add(value);
			}
		}
		//no duplicate values were found in the set
		return true;
	}

}