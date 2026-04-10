import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("This is a program to calculate Body Mass Index (BMI)");
		
		// Get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kilogram: ");
		double weight = scanner.nextDouble();
		System.out.println("Enter height in meter: ");
		double height = scanner.nextDouble();

		// Calculate and output the result
		double bmiValue = weight / (height * height);
		System.out.println("BMI of a person of " + weight + " kg and " + height + " m is " + String.format("%.2f",bmiValue));
	}

}
