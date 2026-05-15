import java.util.Scanner;

public class Lab5Part2{
	// Ngo Yuk Hang, 228991, Lab 5 Part 2
	public static void main(String[] args){
		// Init
		Scanner scanner = new Scanner(System.in);
		
		// First String
		System.out.println("Enter first String : ");
		String firstString = scanner.nextLine();
		int firstStringLength = firstString.length();
		if (firstStringLength >= 8)
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		System.out.println("First String : \"" + firstString + "\" with length " + firstStringLength);	

		// Second String
		System.out.println("\nEnter second String : ");
		String secondString = scanner.nextLine();
		if (firstString.contains(secondString)){
			System.out.println("Second String exists in First String");
		} else {
			System.out.println("Second String not exists in First String");
			firstString += secondString;
			System.out.println("\nNew Statement in String 1 : " + firstString);
		}
	}
}

