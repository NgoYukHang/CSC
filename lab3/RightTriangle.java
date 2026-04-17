import java.util.Scanner;

public class RightTriangle{
	public static void main(String[] args){
		// Welcome message
		System.out.println("This is a program to find perimeter and area of a right triangle.");
		
		// Get inputs from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of side a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter the length of side b: ");
		double b = scanner.nextDouble();
		scanner.close();
		
		// Calculate and output the result
		double c = Math.sqrt(a*a + b*b);
		double perimeter = a + b + c;
		double area = 0.5 * a * b;
		System.out.println("Perimeter is " + perimeter);
		System.out.println("Area is " + area);

	}
}
