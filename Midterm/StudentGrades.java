
/*Melissa Guzman
 * ITC 155
 * Midterm
 * May 24, 2020
 */
import java.util.Scanner;
import java.util.HashMap;

public class StudentGrades {
	
	public static void main(String[] args) {
		
		//set up scanner for user input
		Scanner scnr = new Scanner(System.in);
		
		//declare variables and data types
		String studentName;
		double studentGrade;

		//create HashMap and add data
		HashMap<String, Double> studentGrades = new HashMap<String, Double>();
		// Students's grades (pre-entered)
		studentGrades.put("Harry Rawlins", 84.3);
		studentGrades.put("Stephanie Kong", 91.0);
		studentGrades.put("Shailen Tennyson", 78.6);
		studentGrades.put("Quincy Wraight", 65.4);
		studentGrades.put("Janine Antinori", 98.2);

		//get user input
		System.out.println("Name:");
		studentName = scnr.nextLine();

		// Read in new grade for a student
		System.out.println("New grade:");
		studentGrade = scnr.nextDouble();
		
		//close scanner
		scnr.close();

		
		//set up for loop to change the key set
		for (String str : studentGrades.keySet()) {

			if (str.contains(studentName)) {

				// output initial grade
				System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));

				// replace with new grade in HashMap
				studentGrades.put(studentName, studentGrade);

				// output new grade
				System.out.println(studentName + "'s new grade: " + studentGrade);

			}

		}

	}
}