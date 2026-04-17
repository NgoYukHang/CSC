import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {	
		// Welcome message
		System.out.println("This is a program to find average of three number.");
		
		// Get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNum = scanner.nextDouble();
		System.out.println("Enter second number: ");
		double secondNum = scanner.nextDouble();
		System.out.println("Enter third number: ");
		double thirdNum = scanner.nextDouble();
		scanner.close();
		
		// Calculate and output the result
		double average = (firstNum + secondNum + thirdNum)/3;
		System.out.println("Average of " + firstNum + ", " + secondNum + ", " + thirdNum + " is " + average);
	}
}
