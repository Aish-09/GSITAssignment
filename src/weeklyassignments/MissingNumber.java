package weeklyassignments;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int n = 10; // Numbers are from 1 to 10

        // Step 1: Calculate the expected sum of numbers from 1 to n
        // Formula: n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the actual sum of elements present in the array
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        // Step 3: The difference is the missing number
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}