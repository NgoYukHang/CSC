import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 6 Q4
public class MileageClaim{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		do{
			double distance;

			while(true){
				System.out.println("Claim your mileage by inputing the distance (km) : ");
				try{
					distance = scanner.nextDouble();
				} catch (InputMismatchException e){
					System.out.println("Please input a number!");
					continue;
				}
				break;
			}
			
			double claim;
			if(distance >= 500.0f){
				claim = (500 * 0.70) + ((distance - 500.0) * 0.50);
			}else{
				claim = distance * 0.70;
			}

			System.out.println("Your claim is RM" + String.format("%.2f",claim));
		} while(hasNextStaff());
	}

	public static boolean hasNextStaff(){
		boolean input;
		char response;
		while(true){
			System.out.println("Continue with next staff?");
			response = scanner.next().charAt(0);
			if(response == 'Y' || response == 'y') input = true;
			else if(response == 'N' || response == 'n') input = false;
			else {
				System.out.println("Bad response! Please enter again.");
				continue;
			}
			break;
		}
		scanner.nextLine();
		return input;
	}	
}
