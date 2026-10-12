package weeklyassignments;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 45, 7, 89, 34, 89, 56};

        // Start with the smallest possible integer values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            // If current element is strictly greater than largest
            if (current > largest) {
                secondLargest = largest; // Old largest becomes second largest
                largest = current;       // Update largest
            } 
            // If current element is between largest and secondLargest (strictly distinct)
            else if (current > secondLargest && current != largest) {
                secondLargest = current; // Update second largest
            }
        }

        // Check if a valid second largest element was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

	}

}
