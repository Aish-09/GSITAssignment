package liveassignments;

public class Program_debugger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,50,60};
//		int arr[] = {10,20,30,50,60};
		int sum = 0;
		for (int i=0 ; i<arr.length ; i++)
		{
			sum = sum+arr[i];
			System.out.println("Sum of array" + sum);
		}

	}

}
