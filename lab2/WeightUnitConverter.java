import java.util.Scanner;

public class WeightUnitConverter {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("This is a program to convert weight of parcel in pounds (lbs) to kilograms (kg)");
				
		// Get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight of parcel in pounds (lbs): ");
		double weightInPounds = scanner.nextDouble();
		
		// Calculate and output the result
		final double convertionFactorFromPoundsToKilograms = 0.45359237;
		double weightInKilograms = weightInPounds * convertionFactorFromPoundsToKilograms;
		System.out.println("Weight of parcel of " + weightInPounds + " lbs is " + String.format("%.6f",weightInKilograms) + " kg");
	}

}
