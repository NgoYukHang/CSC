import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 7 Q4
public class AverageCalculator{
	public static void main(String[] args){
		System.out.println("Please enter 5 numbers to calculate their average.");
		
		Scanner scanner = new Scanner(System.in);
		double a = readDouble("Enter first number : ",scanner);
		double b = readDouble("Enter second number : ",scanner);
		double c = readDouble("Enter third number : ",scanner);
		double d = readDouble("Enter fourth number : ",scanner);
		double e = readDouble("Enter fifth number : ",scanner);
		
		double average = calculateAverage(a,b,c,d,e);
	
		System.out.println("\nAverage : " + average);
	}

	public static double readDouble(String message, Scanner scanner){
		double input;
		while(true){
			System.out.println(message);
			try{
				input = scanner.nextDouble();
			} catch(InputMismatchException e){
				System.out.println("Please enter a double.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}

	public static double calculateAverage(double a,double b,double c,double d,double e){
		return (a+b+c+d+e)/5.0;
	}
}
