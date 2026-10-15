package liveassignments;

public class Program_Methods {
	
	//Methods are reusable block of codes
	
	static int sum (int num1 , int num2)
	{
		return (num1+num2);
	}
	
	static void subtract (int num1 , int num2)
	{
		System.out.println("Subtract = " + (num1-num2));
	}
	
	static void main (String[] args)
	{
		int resultA = sum(10,20);
		System.out.println("Result A = " + resultA);
		int resultB = sum(400,500);
		System.out.println("Result B = " + resultB);
		
		subtract (300, 100);
	}

}
