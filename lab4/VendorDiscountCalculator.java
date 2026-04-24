import java.util.Scanner;
import java.util.InputMismatchException;

public class VendorDiscountCalculator{

	public static Scanner scanner = new Scanner(System.in);
	public static float inputPrice;
	public static int inputQuantity;
	public static boolean success;
	public static float totalPrice;
	public static int totalNumberItemsBought;

	public static void main(String[] args){
		// Print welcome message
		System.out.println("Welcome to vendor discount calculator!");
		System.out.println("Please input all the items bought one by one.");
		System.out.println("");

		// Get list of items from user
		float singlePrice;
		int quantity;
		int counter = 1;
		while (true){
			System.out.println("Item no. " + counter);

			System.out.println("Enter the price (RM) : ");
			do{
				singlePrice = getPrice();
			} while(!success);
			if (singlePrice == 0) break;

			System.out.println("Enter the quantity : ");
			do{
				quantity = getQuantity();
			} while(!success);
				
			// Track total items bought and total price
			totalNumberItemsBought += quantity;
			totalPrice += (singlePrice*quantity);

			counter++;

			System.out.println("");
		}
	
		// Calculate percentage discount
		int percentageDiscount;
		if (totalNumberItemsBought >= 1000){
			if (totalPrice > 100)
				percentageDiscount = 43;
			else if (totalPrice > 10)
				percentageDiscount = 32;
			else
				percentageDiscount = 21;
		} else if (totalNumberItemsBought >= 500){
			if (totalPrice > 100)
				percentageDiscount = 32;
			else if (totalPrice > 10)
				percentageDiscount = 23;
			else
				percentageDiscount = 14;
		} else if (totalNumberItemsBought >= 100){
			if (totalPrice > 100)
				percentageDiscount = 21;
			else if (totalPrice > 10)
				percentageDiscount = 15;
			else
				percentageDiscount = 9;
		} else if (totalNumberItemsBought >= 10){
			if (totalPrice > 100)
				percentageDiscount = 9;
			else if (totalPrice > 10)
				percentageDiscount = 7;
			else
				percentageDiscount = 5;
		} else if (totalNumberItemsBought >= 1){
			if (totalPrice > 100)
				percentageDiscount = 5;
			else if (totalPrice > 10)
				percentageDiscount = 2;
			else
				percentageDiscount = 0;
		} else
			percentageDiscount = 0;

		// Calculate discounted price
		float discountPrice = totalPrice * (100 - percentageDiscount) / 100;

		// Print outputs
		System.out.println("");
		System.out.println("Total items bought : " + totalNumberItemsBought);
		System.out.println("Discounted Price : RM" + String.format("%.2f",discountPrice));
	}

	public static float getPrice(){
		try {
			inputPrice = scanner.nextFloat();
		} catch (InputMismatchException e){
			System.out.println("Please enter a correct price.");
			scanner.nextLine();
			success = false;
			return -1;
		}
		if (inputPrice < 0) {
			System.out.println("Please enter a positive number.");
			success = false;
			return -1;
		}
		success = true;
		return inputPrice; 
	}

	public static int getQuantity(){
		try {
			inputQuantity = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please enter an integer.");
			scanner.nextLine();
			success = false;
			return -1;
		}
		if (inputQuantity < 0) {
			System.out.println("Please enter a positive number.");
			success = false;
			return -1;
		}
		success = true;
		return inputQuantity; 
	}
}


