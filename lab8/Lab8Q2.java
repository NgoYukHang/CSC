import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.ArrayList;
// NGO YUK HANG 228991 LAB 8 Q2
public class Lab8Q2{
	public static void main(String[] args){
		System.out.println("This program will find the smallest and largest number entered by user.");
		System.out.println("This program also track the occurrence of the smallest and largest number.");
		System.out.println("Please enter any amount of numbers. Type q to proceed to the calculation.");
		
		Scanner scanner = new Scanner(System.in);
		String input;
		double number;
		ArrayList<Double> numbers = new ArrayList<Double>();

		while(true){
			input = scanner.nextLine();
			if(input == ""){
				System.out.println("Error. Please enter a valid number.");
				continue;
			}
			if(input.charAt(0) == 'q' || input.charAt(0) == 'Q') {
				if(numbers.size() == 0){
					System.out.println("Please enter number.");
					continue;
				}
				break;
			}
			else {
				try{
					number = Double.parseDouble(input);
				} catch (NumberFormatException e){
					System.out.println("Error. Please enter a valid number.");
					//scanner.nextLine();
					continue;
				}
				numbers.add(number);
				System.out.println("Please input another number or q if finish inputing.");
			}
		}
		
		double smallestNumber = numbers.get(0);
		double largestNumber = numbers.get(0);
		int smallestNumberCount = 0;
		int largestNumberCount = 0;

		for(int i = 1 ; i < numbers.size() ; i++){
			double current = numbers.get(i);
			if (current < smallestNumber){
				smallestNumber = current;
			} else if (current > largestNumber){
				largestNumber = current;
			} 		
		}

		for(int i = 0 ; i < numbers.size() ; i++){
			double current = numbers.get(i);
			if (current == smallestNumber) smallestNumberCount++;
			if (current == largestNumber) largestNumberCount++;
		}

		System.out.println("\nYou have entered " + numbers.size() + " numbers.");
		System.out.println("Smallest number is " + smallestNumber + " with " + smallestNumberCount + " times.");
		System.out.println("Largest number is " + largestNumber + " with " + largestNumberCount + " times.");
	}
}
