import java.util.Scanner;
import java.util.InputMismatchException;

public class GradeCalculator{

	public static Scanner scanner = new Scanner(System.in);
	public static int input;

	public static void main(String[] args){
		// Print welcome message
		System.out.println("Welcome to grade calculator!");

		// Init variables
		String[] markMessages = {
			"First test (Full mark is 50) : ",
			"Second test (Full mark is 50) : ",
			"First assignment (Full mark is 30) : ",
			"Second assignment (Full mark is 30) : ",
			"Third assignment (Full mark is 30) : ",
			"Final test (Full mark is 100) : " 
		};
		int[] fullMarks = {50,50,30,30,30,100};
		int[] markToPercentage = {20,20,30,30};
		int[] marks = new int[6];
		int[] percentages = new int[4];

		// Get raw marks from user
		System.out.println("Please enter the marks for each tests below.");
		boolean success;
		for (int i = 0;i<6;i++){
			do{
				System.out.println(markMessages[i]);
			 	success = getAndCheckMark(fullMarks[i]);
				if (success){
					marks[i] = input;
				}
			} while (!success);
		}

		// Convert marks to percentage form
		// First test
		percentages[0] = marks[0] * markToPercentage[0] / fullMarks[0];  
		// Second test
		percentages[1] = marks[1] * markToPercentage[1] / fullMarks[1]; 
		// Assigments
		percentages[2] = (marks[2] + marks[3] + marks[4]) * markToPercentage[2] / (fullMarks[2] + fullMarks[3] + fullMarks[4]); 
		// Final test
		percentages[3] = marks[5] * markToPercentage[3] / fullMarks[5]; 
		
		// Calculate total percentage
		int totalPercentage = percentages[0] + percentages[1] + percentages[2] + percentages[3];

		// Find grade
		String grade;
		if (totalPercentage >= 80)
			grade = "A";
		else if (totalPercentage >= 75)
			grade = "A-";
		else if (totalPercentage >= 70)
			grade = "B+";
		else if (totalPercentage >= 65)
			grade = "B";
		else if (totalPercentage >= 60)
			grade = "B-";
		else if (totalPercentage >= 55)
			grade = "C+";
		else if (totalPercentage >= 50)
			grade = "C";
		else if (totalPercentage >= 47)
			grade = "C-";
		else if (totalPercentage >= 44)
			grade = "D+";
		else if (totalPercentage >= 40)
			grade = "D";
		else
			grade = "F";

		// Print outputs
		System.out.println("");
		System.out.println("Result : ");
		System.out.println("");
		for (int i = 0;i<6;i++){
			System.out.println(markMessages[i] + "" + marks[i]);
		}
		System.out.println("");
		System.out.println("Total percentage : " + totalPercentage + "%");
		System.out.println("Grade : " + grade);
	}

	public static boolean getAndCheckMark(int fullMark){
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please enter an integer.");
			scanner.nextLine();
			return false;
		}
		if (input > fullMark || input < 0){
			System.out.println("You enter a wrong number. Please try again.");
			return false;
		}
		return true; 
	}
}
