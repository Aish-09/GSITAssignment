package weeklyassignments;

public class SeparateNumbers {

    public static void main(String[] args) {
        int[] arr = {-4, 7, 0, -2, 9, 0, -8, -8, 5};

        // Step 1: Print all positive numbers (> 0)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        // Step 2: Print all negative numbers (< 0)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }

        // Step 3: Print all zeros (== 0)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}