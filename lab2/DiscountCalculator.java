import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		// Welcome message
		System.out.println("This is a program to find sale price of an item after a percentage discount.");
		
		// Get inputs from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter original price of the item (RM): ");
		float originalPrice = scanner.nextFloat();
		
		// Retype input if percentage discount is not between 0 and 100%
		float discountPercentage;
		while(true) {
			System.out.println("Enter the percentage discount (%): ");
			discountPercentage = scanner.nextFloat();
			if (!(discountPercentage >= 0 && discountPercentage <= 100)) {
				System.out.println("Please enter percentage discount between 0% to 100%");
			}
			else {
				break;
			}
		}
		scanner.close();
		
		// Calculate and output the result
		double discountedPrice = originalPrice * (100 - discountPercentage) / 100;
		System.out.println(
				"Price of RM" + String.format("%.2f",originalPrice) + 
				" after getting " + discountPercentage + "% is RM" + 
				String.format("%.2f",discountedPrice)
				);
	}
}
