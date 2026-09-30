package assignment_28_09;

public class Typecasting {
	
	public static void main(String[] args) {
        // Store 10.75 in a double variable
        double originalValue = 10.75;

        // Explicitly typecast double to int (truncates the decimal part)
        int castedValue = (int) originalValue;

        // Print both values
        System.out.println("Double value: " + originalValue);
        System.out.println("Integer value: " + castedValue);
    }

}
