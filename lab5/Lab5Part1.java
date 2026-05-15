import java.util.Scanner;

public class Lab5Part1{
	// Ngo Yuk Hang, 228991, Lab 5 Part 1
	public static void main(String[] args){
		// Init
		Scanner scanner = new Scanner(System.in);

		// First String
		System.out.println("Enter first String : ");
		String firstString = scanner.nextLine();
		int firstStringLength = firstString.length();
		if(firstStringLength >= 10){
			System.out.println("Substring from 5 to 10 " + firstString.substring(4,10) + ", length " + firstStringLength);
		} else {
			System.out.println("String length less than 10");
		}
		
		// Second String
		System.out.println("\nEnter second String : ");
		String secondString = scanner.nextLine();
		if(firstString.contains(secondString)){
			System.out.println("Second String exists in First String");
			int indexInFirstString = firstString.indexOf(secondString);
			String newFirstString = firstString.substring(0,indexInFirstString) + "Selamat Datang" + firstString.substring(indexInFirstString + secondString.length());
			System.out.println("\nNew Statement in String 1 : " + newFirstString);
		} else {
			System.out.println("Second String not exists in First String");
		}
	}
}
