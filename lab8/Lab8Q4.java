public class Lab8Q4{
// NGO YUK HANG 228991 LAB 8 Q4
	public static void main(String[] args){
		int[][] myRandom = new int[10][6];
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0; j < 6 ; j++){
				myRandom[i][j] = (int)(Math.random() * 1000);
			}
		}
		
		int smallestNumber;
		int current = myRandom[0][0];
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0; j < 6 ; j++){
				if(myRandom[i][j] < current){
					current = myRandom[i][j];
				}
			}
		}
		smallestNumber = current;

		int count = 0;
		for(int i = 0 ; i < 10 ; i++){
			for(int j = 0; j < 6 ; j++){
				if(myRandom[i][j] == smallestNumber){
					count++;
				}
			}
		}

		System.out.println("The smallest number is " + smallestNumber + " with " + count + " occurrence.");
	}
}
