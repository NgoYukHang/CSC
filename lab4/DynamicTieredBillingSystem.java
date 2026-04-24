import java.util.Scanner;
import java.util.InputMismatchException;

public class DynamicTieredBillingSystem{

	public static Scanner scanner = new Scanner(System.in);
	public static boolean success;

	public static void main(String[] args){
		// Print welcome message
		System.out.println("Welcome to Dynamic Electricity Billing & Sustainability Incentive system!");
		System.out.println("");

		// Init variables
		int electricConsumption;
		boolean isB40,isPeakHour;
		double totalBill = 0;
		double rateForEachkWh;

		// Get inputs
		System.out.println("Enter electric consumption (kWh) : ");
		do{
			electricConsumption = getElectricConsumption();
		} while (!success);

		System.out.println("Enter user category (1 for B40, 2 for Standard): ");
		do{
			isB40 = getB40();
		} while (!success);

		System.out.println("Is it peak hour (1 for Yes, 0 for No): ");
		do{
			isPeakHour = getPeakHour();
		} while (!success);

		// Calculate Base Charge
		if (electricConsumption > 600){
			rateForEachkWh = 0.546;
		} else if (electricConsumption > 300){
			rateForEachkWh = 0.516;
		} else if (electricConsumption > 200){
			rateForEachkWh = 0.334;
		} else{
			rateForEachkWh = 0.218;
		}
		double baseCharge = electricConsumption * rateForEachkWh;
		totalBill += baseCharge;

		// Calculate surcharge amount
		double surchargeAmount = 0;
		if (isPeakHour){
			surchargeAmount = baseCharge * 0.10;
			totalBill += surchargeAmount;
		}

		// Calculate discount
		boolean isDiscount = false;
		if (electricConsumption < 100){ 
			totalBill = totalBill * 0.95;
			isDiscount = true;
		}

		// Calculate rebate amount
		double rebateAmount = 0;
		if (isB40 && totalBill > 40){
			rebateAmount = 40;
			totalBill -= 40;
		}

		// Print outputs
		System.out.println("");
		System.out.println("Electric consumption (kWh) : " + electricConsumption);
		System.out.println("User category : " + ((isB40) ? "B40" : "Standard"));
		System.out.println("Peak hours : " + ((isPeakHour) ? "Yes" : "No"));
		System.out.println("Base charge (RM) : " + String.format("%.2f",baseCharge));
		System.out.println("Surcharge charge (RM) : " + String.format("%.2f",surchargeAmount));
		if (isDiscount){
			System.out.println("Your total consumption is less than 100kWh. You are a Green Saver. : Discount 5%");
		}
		System.out.println("Rebate charge (RM) : " + String.format("%.2f",rebateAmount));
		System.out.println("Total bill (RM) : " + String.format("%.2f",totalBill));
	}

	public static int getElectricConsumption(){
		int input;
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please enter a integer.");
			scanner.nextLine();
			success = false;
			return -1;
		}
		if (input < 0) {
			System.out.println("Please enter a positive number.");
			success = false;
			return -1;
		}
		success = true;
		return input; 
	}

	public static boolean getB40(){
		int input;
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please input 1 for B40, 2 for Standard.");
			scanner.nextLine();
			success = false;
			return false;
		}

		if (input == 1) {
			success = true;
			return true;
		} else if (input == 2) {
			success = true;
			return false;
		} else {
			System.out.println("Please input 1 for B40, 2 for Standard.");
			success = false;
			return false;
		}
	}

	public static boolean getPeakHour(){
		int input;
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Please input 1 for Yes, 0 for No.");
			scanner.nextLine();
			success = false;
			return false;
		}

		if (input == 1) {
			success = true;
			return true;
		} else if (input == 0) {
			success = true;
			return false;
		} else {
			System.out.println("Please input 1 for Yes, 0 for No.");
			success = false;
			return false;
		}
	}
}
	
