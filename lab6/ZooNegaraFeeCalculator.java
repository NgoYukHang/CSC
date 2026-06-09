import java.util.Scanner;
import java.util.InputMismatchException;
// NGO YUK HANG 228991 LAB 6 Q2
public class ZooNegaraFeeCalculator{

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Welcome to the Zoo Negara!\nEnter the ticket you want to buy!\n");
		
		final int[][] ticketPrice = {{43,16,21},{50,25,50},{61,33,61},{82,43,82}};

		int i,j = 0;
		int totalPrice = 0;

		boolean hasAnotherVisitor = true;	

		// Loop for multiple visitor
		for(int indexVisitor = 1; hasAnotherVisitor ; indexVisitor++, totalPrice = 0){
			System.out.println("****** VISITOR " + indexVisitor + " ******\n");

			// Loop for multiple ticket
			do{
				int numberTicketBought = 0;

				// Get all required infomation about the ticket from user
				while(true){
					char nationality = getCharResponse("Enter the nationality (M = Malaysian, I = Kad/Working Permit/Dependant Pass, E = ASEAN, O = Others) : ");
					switch(nationality){
						case 'M':
							i = 0; break;
						case 'I':
							i = 1; break;
						case 'E':
							i = 2; break;
						case 'O':
							i = 3; break;
						default:
							System.out.println("Bad response for nationality!");
							continue;
 					}

					char ageGroup = getCharResponse("Enter the age group (A = Adult, C = Children (3 to 12 years old), S = Senior (60 years and above)) : ");
					switch(ageGroup){
						case 'A':
							j = 0; break;
						case 'C':
							j = 1; break;
						case 'S':
							j = 2; break; 	
						default:
							System.out.println("Bad response for age group!");
							continue;
					}
	
					numberTicketBought = getIntResponse("Enter the number of ticket to buy : ");
					if(numberTicketBought < 0) {
						System.out.println("Bad response for number of ticket!");
						continue;
					}

					break;
				}

				// Calculate ticket price
				int currentPrice = ticketPrice[i][j] * numberTicketBought;
				System.out.println("Ticket/Tickets for RM" + String.format("%.2f",(double)currentPrice) + " is/are charged.\n");
				totalPrice += currentPrice;

			} while(getBooleanResponse("Buy other ticket? (Y/N) : ")); 	// Ask for another ticket

			// Display total price
			System.out.println("\nThe total payment for VISITOR " + indexVisitor + " is RM" + String.format("%.2f",(double)totalPrice) + "\n");

			// Ask for another visitor
			hasAnotherVisitor = getBooleanResponse("Enter another visitor (Y/N) : ");
			System.out.println("");
		}

		System.out.println("Thanks for using the system!");
	}

	public static char getCharResponse(String question){
		System.out.println(question);
		return scanner.next().charAt(0);
	}

	public static int getIntResponse(String question){
		int input;
		while(true){
			System.out.println(question);
			try{
				input = scanner.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Bad response! Please enter again.");
				scanner.nextLine();
				continue;
			}
			break;
		}
		return input;
	}

	public static boolean getBooleanResponse(String question){
		boolean input;
		char response;
		while(true){
			System.out.println(question);
			response = scanner.next().charAt(0);
			if(response == 'Y' || response == 'y') input = true;
			else if(response == 'N' || response == 'n') input = false;
			else {
				System.out.println("Bad response! Please enter again.");
				continue;
			}
			break;
		}
		return input;
	}
}
