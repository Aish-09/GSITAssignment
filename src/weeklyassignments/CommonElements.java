package weeklyassignments;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {30, 40, 60, 70, 50};

        System.out.print("Common elements: ");

        for (int i = 0; i < arr1.length; i++) {
            // Step 1: Ensure arr1[i] hasn't already been processed earlier in arr1
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (arr1[k] == arr1[i]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (alreadyProcessed) {
                continue;
            }

            // Step 2: Check if arr1[i] exists in arr2
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // Found match, break inner loop to avoid printing duplicates
                }
            }
        }
        System.out.println();
    }
}