package Lab8Q3;

import Lab8Q3.Task.*;

public class Student{
	private String name;
	private String matric;
	private int[] marks = new int[6];
	private int[] percentages = new int[4];
	private int totalPercentage;
	private String grade;

	public static final int[] fullMarks = {50,50,30,30,30,100};
	public static final int[] markToPercentage = {20,20,30,30};

	public static final String[] markMessages = {
			"First test (Full mark is " + fullMarks[0] + ")        : ",
			"Second test (Full mark is " + fullMarks[1] + ")       : ",
			"First assignment (Full mark is " + fullMarks[2] + ")  : ",
			"Second assignment (Full mark is " + fullMarks[3] + ") : ",
			"Third assignment (Full mark is " + fullMarks[4] + ")  : ",
			"Final test (Full mark is " + fullMarks[5] + ")       : " 
	};

	public Student(String name, String matric, int[] marks){
		this.name = name;
		this.matric = matric;
		for(int i = 0;i<6;i++){
			this.marks[i] = marks[i];
		}
		calculatePercentage();
		calculateGrade();
	}

	private void calculatePercentage(){
		// First test
		percentages[0] = marks[0] * markToPercentage[0] / fullMarks[0];  
		// Second test
		percentages[1] = marks[1] * markToPercentage[1] / fullMarks[1]; 
		// Assigments
		percentages[2] = (marks[2] + marks[3] + marks[4]) * markToPercentage[2] / (fullMarks[2] + fullMarks[3] + fullMarks[4]); 
		// Final test
		percentages[3] = marks[5] * markToPercentage[3] / fullMarks[5]; 
		
		// Calculate total percentage
		totalPercentage = percentages[0] + percentages[1] + percentages[2] + percentages[3];
	}

	private void calculateGrade(){
		if (totalPercentage >= 80)
			grade = "A";
		else if (totalPercentage >= 75)
			grade = "A-";
		else if (totalPercentage >= 70)
			grade = "B+";
		else if (totalPercentage >= 65)
			grade = "B";
		else if (totalPercentage >= 60)
			grade = "B-";
		else if (totalPercentage >= 55)
			grade = "C+";
		else if (totalPercentage >= 50)
			grade = "C";
		else if (totalPercentage >= 47)
			grade = "C-";
		else if (totalPercentage >= 44)
			grade = "D+";
		else if (totalPercentage >= 40)
			grade = "D";
		else
			grade = "F";
	}

	public String printStats(){
		String stats = "\n---------------------------------------------------------------------";
		stats += "\nName : " + name;
		stats += "\nMatric : " + matric;
		stats += "\nResult : \n";

		for (int i = 0;i<6;i++){
			stats += markMessages[i] + marks[i] + "\n";
		}
		
		stats += "Total percentage : " + totalPercentage + "%\n";
		stats += "Grade : " + grade + "\n";
		stats += "---------------------------------------------------------------------\n";

		return stats;
	}
	
	public String getName(){
		return name;
	}

	public String getMatric(){
		return matric;
	}

	public int getMark(Task.Mark index){
		return marks[index.ordinal()];
	}

	public int getPercentage(Task.Percentage index){
		return percentages[index.ordinal()];
	}

	public int getTotalPercentage(){
		return totalPercentage;
	}

	public String getGrade(){
		return grade;
	}

	public int getGradeIndex(){
		switch(grade){
			case "A" : return 0;
			case "A-" : return 1; 
			case "B+" : return 2;
			case "B" : return 3; 
			case "B-" : return 4; 
			case "C+" : return 5;
			case "C" : return 6; 
			case "C-" : return 7;
			case "D+" : return 8; 
			case "D" : return 9;
			case "F" : return 10; 
		}
		return -1;
	}
}
