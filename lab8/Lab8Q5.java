public class Lab8Q5{
// NGO YUK HANG 228991 LAB 8 Q5
	public static void main(String[] args){
		int[][] matrix = new int[5][5];
		for(int i = 0;i<5;i++){
			for(int j=0;j<5;j++){
				matrix[i][j] = (int)Math.round(Math.random());
			}
		}

		int largestRowIndex = 0;
		int largestColumnIndex = 0;
		int currentRow = 0;
		int currentColumn = 0;
		int totalRow = 0;
		int totalColumn = 0;
		for(int i = 0;i<5;i++){
			for(int j = 0;j<5;j++){
				totalRow += matrix[i][j];
				totalColumn += matrix[j][i];
			}
			if(currentRow < totalRow){ 
				currentRow = totalRow;
				largestRowIndex = i;
			}
			if(currentColumn < totalColumn){ 	
				currentColumn = totalColumn;
				largestColumnIndex = i;
			}
			totalRow = 0;
			totalColumn = 0;
		}
		
		for(int i = 0;i<5;i++){
			if(i == largestRowIndex) System.out.print(">");
			else System.out.print(" ");

			for(int j = 0;j<5;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
		String space = " ";
		for(int k = 0;k<largestColumnIndex;k++){
			space += " ";
		}
		System.out.println(space + "^");

		System.out.println("The largest row index : " + largestRowIndex);
		System.out.println("The largest column index : " + largestColumnIndex);
	}
}
