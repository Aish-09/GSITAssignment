package liveassignments;

public class Addition_Matrix {

    public static void main(String[] args) {
        
        // Step 1: Declare and initialize two 3x3 matrices (3 rows and 3 columns)
        int[][] matrixA = {
            {10, 20, 30},
            {40, 50, 60},
            {80, 90, 100}
        };

        int[][] matrixB = {
            {10, 20, 30},
            {40, 50, 60},
            {80, 90, 100}
        };

        // Step 2: Determine matrix dimensions dynamically
        int rows = matrixA.length;          // Number of rows (3)
        int cols = matrixA[0].length;       // Number of columns in the first row (3)

        // Step 3: Instantiate matrixC to store the sums with the exact same dimensions
        int[][] matrixC = new int[rows][cols];

        System.out.println("--- Result of Matrix Addition (Matrix C) ---");

        // Step 4: Outer loop controls the row index (moves vertically)
        for (int row = 0; row < rows; row++) {

            // Step 5: Inner loop controls the column index (moves horizontally across each row)
            for (int col = 0; col < cols; col++) {
                
                // Add corresponding cells from matrixA and matrixB
                matrixC[row][col] = matrixA[row][col] + matrixB[row][col];

                // Print the sum with a trailing space on the current line
                System.out.print(matrixC[row][col] + " ");
            }

            // Step 6: Move cursor down to start the next row on a fresh line
            System.out.println();
        }
    }
}