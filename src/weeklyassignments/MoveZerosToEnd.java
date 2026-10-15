package weeklyassignments;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 8, 0, 2, 9};

        // Pointer to place the next non-zero element
        int nonZeroIndex = 0;

        // Step 1: Shift all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill the remaining positions with zeros using a while loop
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        // Step 3: Print the modified array
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 
}
