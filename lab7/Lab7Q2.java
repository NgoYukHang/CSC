//NGO YUK HANG 228991 LAB 7 Q2
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab7Q2{

	public static Scanner scanner = new Scanner(System.in);
	public static int result;

	public static void main(String[] args){
		System.out.println("Please enter 2 integers to calculate their differences, quotients and remainders");
		
		int intA = readInt("First integer : ");
		int intB = readInt("Second integer : ");

		System.out.println();

		calculateDifference(intB,intA);
		System.out.println(intB + "-" + intA + "=" + result);	

		calculateDifference(intA,intB);
		System.out.println(intA + "-" + intB + "=" + result);	

		calculateQuotient(intB,intA);
		System.out.println(intB + "/" + intA + "=" + result);	

		calculateQuotient(intA,intB);
		System.out.println(intA + "/" + intB + "=" + result);	

		calculateRemainder(intB,intA);
		System.out.println(intB + "%" + intA + "=" + result);	

		calculateRemainder(intA,intB);
		System.out.println(intA + "%" + intB + "=" + result);	
	}

	public static int readInt(String message){
		int input;
		while(true){
			System.out.println(message);
			try{
				input = scanner.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Please enter an integer.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}

	public static void calculateDifference(int first, int second){
		result = first - second;
	}
		
	public static void calculateQuotient(int first, int second){
		result = first / second;
	}
	
	public static void calculateRemainder(int first, int second){
		result = first % second;
	}
}
