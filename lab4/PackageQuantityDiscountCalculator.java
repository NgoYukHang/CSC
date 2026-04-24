import java.util.Scanner;

public class PackageQuantityDiscountCalculator {
	public static void main(String[] args){
		// Get quantity of package purchased from user
		System.out.println("Please enter the number of number of packages purchased (Each package is RM49.50): ");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();

		// Check discount
		int discount;
		if (quantity >= 300){
			discount = 30;
		} else if (quantity >= 100) {
			discount = 20;
		} else if (quantity >= 50) {
			discount = 15;
		} else if (quantity >= 20) {
			discount = 10;
		} else {
			discount = 0;
		}

		// Calculate purchase after discount
		final float priceOfSinglePackage = 49.50f;
		float purchaseAfterDiscount = quantity * priceOfSinglePackage * (100 - discount) / 100;

		// Print output
		System.out.println("Number of packages purchased : " + quantity);
		System.out.println("Discount : " + discount + "%");
		System.out.println("Price after discount : RM" + String.format("%.2f",purchaseAfterDiscount));
	}
}
