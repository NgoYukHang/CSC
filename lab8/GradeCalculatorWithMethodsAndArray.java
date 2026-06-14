package Lab8Q3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import Lab8Q3.Student;
import Lab8Q3.Task.*;

//NGO YUK HANG 228991 LAB 8 Q3
public class GradeCalculatorWithMethodsAndArray{

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<Student> topStudents = new ArrayList<Student>();
	public static ArrayList<Student> botStudents = new ArrayList<Student>();

	public static int highestMark = 0;
	public static int lowestMark = 0;
	public static int[] amountGradeScorer = new int[11];

	public static void main(String[] args){
		// Print welcome message
		System.out.println("Welcome to grade calculator!\n");
		
		// Inputs and calculation
		do{
			Student student = new Student( readName() , readMatric() , readMarks() ); 
			students.add(student);	
			System.out.println(student.printStats());
		} while(hasNextStudent());

		// Display overall stats
		calculateAllStudentsStats();
		displayAllStudentsStats();
	}

	public static String readName(){
		System.out.println("Please enter student name : ");
		return scanner.nextLine();
	}

	public static String readMatric(){
		System.out.println("Please enter matric number : ");
		return scanner.nextLine();
	}

	public static int[] readMarks(){
		int[] marks = new int[6];
		
		System.out.println("\nPlease enter the marks for each tests below.");
		int input;

		for (int i = 0;i<6;i++){
			while(true){
				System.out.println(Student.markMessages[i]);
				try {
					input = scanner.nextInt();
				} catch (InputMismatchException e){
					System.out.println("Please enter an integer.");
					scanner.nextLine();
					continue;
				}
				if(checkValidMark(input,i)) break;
				else continue;
			}
			marks[i] = input;
		}

		return marks;
	}

	public static boolean checkValidMark(int input, int index){
		if (input > Student.fullMarks[index] || input < 0){
			System.out.println("The mark should fall between 0 to " + Student.fullMarks[index] + ". Please type again.");
			return false;
		} else return true; 
	}
	
	public static void calculateAllStudentsStats(){
		int size = students.size();	
		int latestLow = students.get(0).getTotalPercentage();
		int latestHigh = students.get(0).getTotalPercentage();

		for(int j = 1; j < size;j++){
			int current = students.get(j).getTotalPercentage();
			if(current < latestLow){
				latestLow = current;
			}
			if(current > latestHigh){
				latestHigh = current;
			}
		}
		highestMark = latestHigh;
		lowestMark = latestLow;

		for(int i = 0;i<size;i++){
			int temp = students.get(i).getTotalPercentage();
			if(temp == highestMark) topStudents.add(students.get(i));
			if(temp == lowestMark) botStudents.add(students.get(i));
		}

		for(int i = 0;i<size;i++){
			int gradeIndex = students.get(i).getGradeIndex();
			int temp = amountGradeScorer[gradeIndex];
			temp++;
			amountGradeScorer[gradeIndex] = temp;
		}
	}

	public static void displayAllStudentsStats(){
		System.out.println("\nThere are " + students.size() + " students.");

		System.out.print("\nTop Scorer (" + highestMark + "%) : ");
		for(int i = 0;i<topStudents.size();i++){
			System.out.print(topStudents.get(i).getName());
			if(i != topStudents.size() - 1) System.out.print(", ");
		}

		System.out.print("\nBot Scorer (" + lowestMark + "%) : ");
		for(int i = 0;i<botStudents.size();i++){
			System.out.print(botStudents.get(i).getName());
			if(i != botStudents.size() - 1) System.out.print(", ");
		}

		System.out.println("\n\nGrades : ");
		System.out.println("A+ : " + amountGradeScorer[0]);
		System.out.println("A  : " + amountGradeScorer[1]);
		System.out.println("B+ : " + amountGradeScorer[2]);
		System.out.println("B  : " + amountGradeScorer[3]);
		System.out.println("B- : " + amountGradeScorer[4]);
		System.out.println("C+ : " + amountGradeScorer[5]);
		System.out.println("C  : " + amountGradeScorer[6]);
		System.out.println("C- : " + amountGradeScorer[7]);
		System.out.println("D+ : " + amountGradeScorer[8]);
		System.out.println("D  : " + amountGradeScorer[9]);
		System.out.println("F  : " + amountGradeScorer[10]);
	}

	public static boolean hasNextStudent(){
		System.out.println("Continue to enter another student? (Y/N)");
		char input;
		while(true){
			try{
				input = scanner.next().charAt(0);
			} catch (Exception e){
				continue;
			}
			if(input == 'Y' || input == 'y'){ scanner.nextLine(); return true;}
			else if(input == 'N' || input == 'n'){ scanner.nextLine(); return false;}
			continue;
		}
	}
}
