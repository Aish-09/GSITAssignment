package Liveassignments;

public class Checkgrade {
	
	public static void main (String [] agrs) {
		
		int marks = 90;
		char grade = ' ';
		
		if (marks>=90 && marks <=100)
		{
			grade = 'A';
		}
		else if (marks >= 80 && marks <= 89) {
			grade = 'B';
		} else if (marks >= 70 && marks <= 79) {
			grade = 'C';
		} else {
			grade = 'D';
		} 
		System.out.println("Grade = " + grade);
	}

}
