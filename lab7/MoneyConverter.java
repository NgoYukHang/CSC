import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 7 Q%
public class MoneyConverter{
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		while(true){
			displayMenu();
			int state = acceptMenuInput();
			if(state == 4){
				System.out.println("Thank you for using the program.");
				System.exit(0);
			}
			displayResult(state);
			System.out.println("\nPress enter to continue...\n");
			scanner.nextLine();
			scanner.nextLine();
		}
	}

	public static void displayMenu(){
		System.out.println("---------------------------------------------------------------");
		System.out.println("Select a number to continue.");
		System.out.println("1. Convert to USD (United State Dollar)");
		System.out.println("2. Convert to GBP (British Pound Sterling)");
		System.out.println("3. Convert to SAR (Saudi Riyal)");
		System.out.println("4. Quit the program");
		System.out.println("---------------------------------------------------------------");
	}

	public static int acceptMenuInput(){
		int input;
		while(true){
			try{
				input = scanner.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Error! Please enter number 1,2,3 or 4 only to access the menu.");
				scanner.nextLine();
				continue;
			}
			if (!(input == 1 || input == 2 || input == 3 || input == 4)){
				System.out.println("Error! Please enter number 1,2,3 or 4 only to access the menu.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}

	public static double acceptMoneyInput(){
		double input;
		while(true){
			System.out.println("MYR : ");
			try{
				input = scanner.nextDouble();
			} catch (InputMismatchException e){
				System.out.println("Error! Please enter valid value.");
				scanner.nextLine();
				continue;
			}
			if (input < 0){
				System.out.println("Error! Please enter valid value.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}

	public static void displayResult(int state){
		double moneyMYR = acceptMoneyInput();
		double moneyAfterConversion;
		if (state == 1){
			moneyAfterConversion = moneyMYR * 0.4006;
			System.out.println("MYR " + String.format("%.2f",moneyMYR) + " = USD " + String.format("%.2f",moneyAfterConversion));
		} else if (state == 2){
			moneyAfterConversion = moneyMYR * 0.2890;
			System.out.println("MYR " + String.format("%.2f",moneyMYR) + " = GBP " + String.format("%.2f",moneyAfterConversion));
		} else if (state == 3){
			moneyAfterConversion = moneyMYR * 1.1293;
			System.out.println("MYR " + String.format("%.2f",moneyMYR) + " = SAR " + String.format("%.2f",moneyAfterConversion));
		}
	}
}
