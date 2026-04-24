import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuInRestaurant {

	public static Scanner scanner = new Scanner(System.in);
	public static int item;
	public static String food;
	public static float price;
	public static int input;

	public static void main(String[] args){
		// Print welcome message
		System.out.println("Welcome to the restaurant!");
		System.out.println("");
	
		// Loop
		while (true){
			// Get item number from user
			item = getItem();
			// Set food and price based on item selected
			setFoodAndPrice(item);

			// Print selected food and price
			System.out.println("");
			System.out.println("Item : " + item);
			System.out.println("Selected food : " + food);
			System.out.println("Price : RM" + String.format("%.2f",price));
			System.out.println("");

			// Tell user to select for other item
			System.out.println("You can select from other items.");
			System.out.println("");
		}
	}

	public static int getItem(){
		System.out.println("Please choose a number from the item lists : ");
		System.out.println("Type 1,2,3 for foods");
		System.out.println("Type 0 to quit");
		input = -1;
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please enter a number.");
			System.out.println("");
			scanner.nextLine();
			getItem();
		}
		if (input > 3 || input < 0){
			System.out.println("You enter a wrong number.");
			System.out.println("");
			getItem();
		}
		return input; 
	}

	public static void setFoodAndPrice(int item){
		switch (item){
			case 0:
				System.out.println("");
				System.out.println("Thanks for coming!");
				System.exit(0);
			case 1:
				food = "Nasi Briani Gam";
				price = 14.99f;
				break;
			case 2:
				food = "Laksa Johor";
				price = 5.00f;
				break;
			case 3:
				food = "Nasi +2 lauk";
				price = 6.00f;
				break;
		}
	}
}
