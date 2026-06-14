import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Lab8Q1{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Enter total amount of numbers to be randomly generated between 120 to 500");
		int amount = acceptAmountOfNumber();

		int[] numbers = new int[amount];
		int total = 0;
		ArrayList<Integer> divisibleNumberByThree = new ArrayList<Integer>();
		ArrayList<Integer> divisibleNumberByTen = new ArrayList<Integer>();
		ArrayList<Integer> divisibleNumberByThreeAndTen = new ArrayList<Integer>();

		for (int i = 0; i < amount; i++){
			int j = ((int)(Math.random() * (500-120))) + 120;
			total += j;
			if(j % 3 == 0) {
				divisibleNumberByThree.add(j);
				if(j % 10 == 0) {
					divisibleNumberByThreeAndTen.add(j);
				}
			} else if(j % 10 == 0){
				divisibleNumberByTen.add(j);
			}
			numbers[i] = j;
		}

		double average = ((double)total)/amount;
		System.out.println("\nAverage : " + average + "\n");

		String percentageThree = String.format("%.2f",(double)divisibleNumberByThree.size()/amount * 100.0);
		String percentageTen = String.format("%.2f",(double)divisibleNumberByTen.size()/amount * 100.0);
		String percentageThreeAndTen = String.format("%.2f",(double)divisibleNumberByThreeAndTen.size()/amount * 100.0);

		System.out.println("There are " + divisibleNumberByThree.size() +  " numbers (" + percentageThree + "%) that can be divided by 3 : ");
		System.out.println(divisibleNumberByThree);
		System.out.println();
		System.out.println("There are " + divisibleNumberByTen.size() +  " numbers (" + percentageTen + "%) that can be divided by 10 : ");
		System.out.println(divisibleNumberByTen);
		System.out.println();
		System.out.println("There are " + divisibleNumberByThreeAndTen.size() +  " numbers (" + percentageThreeAndTen + "%) that can be divided by 3 and 10 : ");
		System.out.println(divisibleNumberByThreeAndTen);
	}

	public static int acceptAmountOfNumber(){
		int input;
		while(true){
			try{
				input = scanner.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Please enter an integer.");
				scanner.nextLine();
				continue;
			}
			if (input < 0){
				System.out.println("Please enter a positive number.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}
}
