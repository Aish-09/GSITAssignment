package dailyassignments;

public class Program_DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 20, 40, 10, 50, 30, 60 , 60, 10};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            // Check if arr[i] already appeared before index i
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyProcessed = true;
                    break;
                }
            }
            
            if (alreadyProcessed) {
                continue;
            }

            // Check if arr[i] appears ahead in the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // Found at least one duplicate, move to next element
                }
            }
        }
        System.out.println();
	}

}
