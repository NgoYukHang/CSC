import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 6 Q1
public class MailOrderHouse{
	public static void main(String[] args){
		System.out.println("Welcome to mail-order house!");
		double productPrice = 0, totalPrice = 0;
		char input;
		int quantitySold = 0;
		Scanner scanner = new Scanner(System.in);
		boolean skip = false;

		while(true){
			System.out.println("\nPlease enter the product number (1 to 5) and the quantity sold."+
					"\nEnter 0 to exit the program.");
			skip = false;

			System.out.println("Product Number : ");
			input = scanner.next().charAt(0);
		
			switch(input){
				case '0':
					System.out.println("Total Price : RM" + String.format("%.2f",totalPrice));
					System.exit(0);
				case '1':
					productPrice = 2.98;
					break;
				case '2':
					productPrice = 4.50;
					break;
				case '3':
					productPrice = 9.98;
					break;
				case '4':
					productPrice = 4.49;
					break;
				case '5':
					productPrice = 6.87;
					break;
				default:
					System.out.println("Please enter a correct number.");
					scanner.nextLine();
					skip = true;
			}

			if(!skip){
				System.out.println("Quantity Sold : ");
				try{
					quantitySold = scanner.nextInt();
				}
				catch (InputMismatchException e){
					System.out.println("Please enter a integer.");
					scanner.nextLine();
					skip = true;
				}
				if (quantitySold < 0){
					System.out.println("Please enter a positive integer.");
					scanner.nextLine();
					skip = true;
				}
			}

			if(!skip){
				totalPrice += productPrice * quantitySold;
				System.out.println("Total Price : RM" + String.format("%.2f",totalPrice));
			}
		}
	}
}
