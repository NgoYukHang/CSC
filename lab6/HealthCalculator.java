import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 6 Q3
public class HealthCalculator{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		String[] weightCategory = {"Normal","Over Weight","Obese","Severely Obese","Morbidly Obese","Undefined"};
		String name;
		float height,weight,waistSize;
		boolean isMale = false;
		String currentUserWeightCategory;
		boolean isHighRisk = false;

		do{
			// Display general info
			System.out.println("BMI information: \n" 
				+ "BMI (18.5-24.9) → Normal \n"
				+ "BMI (25-29.9) → Over Weight \n"
				+ "BMI (30-34.9) → Obese \n" 
				+ "BMI (35-39.9) → Severely Obese \n"
				+ "BMI (>=40) → Morbidly Obese \n"
				+ "*********************************************** \n"
				+ "CAUTION!! \n"
				+ "Women : waist size > 35 inches \n"
				+ "Men : waist size > 40 inches \n"
				+ "----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------ \n"
				+ "*********************************************** \n"
				+ "\n"
				+ "HEALTH CALCULATOR \n");
		
			// Get all required infomation about the user
			while(true){
				name = getStringResponse("Enter your name : ");
					
				char gender = getCharResponse("Enter your gender (M/F) : ");
				if(gender == 'M' || gender == 'm') isMale = true;
				else if (gender == 'F' || gender == 'f') isMale = false; 
				else {
					System.out.println("Bad response for gender!");
					continue;
				}
	
				height = getFloatResponse("Enter your height in meters : ");
				if(height < 0) {
					System.out.println("Bad response for height!");
					continue;
				}

				weight = getFloatResponse("Enter your weight in kilogram : ");
				if(weight < 0) {
					System.out.println("Bad response for weight!");
					continue;
				}

				waistSize = getFloatResponse("Enter your waist size in inches : ");
				if(waistSize < 0) {
					System.out.println("Bad response for waist size!");
					continue;
				}

				break;
			}

			// Calculation
			float BMI = weight / height / height;
			
			if (BMI >= 40.0) 
				currentUserWeightCategory = weightCategory[4];
			else if (BMI >= 35.0)
				currentUserWeightCategory = weightCategory[3];
			else if (BMI >= 30.0)
				currentUserWeightCategory = weightCategory[2];
			else if (BMI >= 25.0)
				currentUserWeightCategory = weightCategory[1];
			else if (BMI >= 18.5)
				currentUserWeightCategory = weightCategory[0];
			else 
				currentUserWeightCategory = weightCategory[5];
			
			if (isMale && waistSize >= 40) 
				isHighRisk = true;
			else if (!isMale && waistSize >= 35)
				isHighRisk = true;
			else
				isHighRisk = false;

			// Display result
			System.out.println(name + ", your BMI is " + String.format("%.2f",BMI) + ", so that means you are " + currentUserWeightCategory + ".");
			if(isHighRisk) System.out.println("You have higher risk for heart disease and diabetes.");

		} while(hasNextPerson()); // Ask for continue to next person
	
		System.out.println("Thank you for using the system.");

	}

	public static String getStringResponse(String question){
		System.out.println(question);
		String input = scanner.nextLine();
		return input;
	}

	public static char getCharResponse(String question){
		System.out.println(question);
		char input = scanner.next().charAt(0);
		scanner.nextLine();
		return input;
	}

	public static float getFloatResponse(String question){
		float input;
		while(true){
			System.out.println(question);
			try{
				input = scanner.nextFloat();
			} catch (InputMismatchException e){
				System.out.println("Bad response! Please enter again.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		scanner.nextLine();
		return input;
	}

	public static boolean hasNextPerson(){
		boolean input;
		char response;
		while(true){
			System.out.println("Continue with next person?");
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
