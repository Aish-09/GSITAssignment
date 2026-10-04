package weeklyassignmens;

public class assignment3_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//REVERSE A NUMBER
		
		int num = 12345;
		int rev = 0;
		while (num > 0) {
			int lastdigit = num % 10 ; 
			rev = (rev * 10) + lastdigit;
			num = num / 10;
		}
		System.out.println("Reversed Number = "+ rev);

	main1(args);}
	
	//-----------------------------------------------------------------------------------------------------
	
	//Count of digit 
	public static void main1(String[] args) {
		
		int num = 987654;
        int count = 0;

        while (num > 0) {
            num = num / 10; 
            count++;
        }
        System.out.println("\n");
        System.out.println("Number of digits = " + count);
    main2(args);}
	
	
	//-------------------------------------------------------------------------------------------------------
	
	//Armstrong Number
	public static void main2(String[] args) {
		
		int num = 153;
        int originalNum = num;
        int sum = 0;

        
        while (num > 0) {
            int lastDigit = num % 10;  
            sum = sum + (lastDigit * lastDigit * lastDigit); // Cube and add
            num = num / 10;
        }
        
        System.out.println("\n");

        // Check if the sum of cubed digits matches the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    main3(args);}
	
	//----------------------------------------------------------------------------------------------------------
	//ODD Or Even
	
	public static void main3(String[] args) {
		
        System.out.println("\n");
		System.out.println("Even numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        // Odd numbers start at 1 and step by 2
        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
	main4(args);}
	
	//---------------------------------------------------------------------------------------------------------
	
	//Sum of Digit
	public static void main4(String[] args)
	{
		int sum = 0;
		
		for (int i = 2;i<=50 ; i+=2) {
			sum += i;
		}
		System.out.println("\n");
		System.out.println("Sum of even numbers = " + sum);
	main5(args);}
	
	public static void main5(String[] args) {
		
		int num = 5445;
        int originalNum = num; // Preserve the original value for comparison
        int rev = 0;

        // Loop to reverse the number
        while (num > 0) {
            int lastDigit = num % 10;     // Extract the last digit
            rev = (rev * 10) + lastDigit; // Shift left and append digit
            num = num / 10;               // Remove the last digit
        }
        
        System.out.println("\n");
        // Compare reversed number with the original number
        if (originalNum == rev) {
            System.out.println(originalNum + " is a palindrome");
        } else {
            System.out.println(originalNum + " is not a palindrome");
        }
	}
}
	
