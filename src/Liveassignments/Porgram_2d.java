package liveassignments;

public class Porgram_2d {

    public static void main(String[] args) {
        // 2D Array: 2 rows and 4 columns
        int marks[][] = {
            {100, 99, 88, 10},
            {400, 30, 50, 10}
        };

        // Accessing a specific element: Row 1, Column 0 -> prints 40
        System.out.println("Element at [1][0]: " + marks[1][0]);
        System.out.println("Element at [0][0]: " + marks[0][0]);
        
        System.out.println("\n--- 2D Array Matrix ---");

        // Outer loop: Controls the rows
        for (int row = 0; row < marks.length; row++) {
            
            // Inner loop: Controls the columns for the current row
            for (int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column] + " ");
            }
            
            // Move cursor to the next line AFTER all columns in this row are printed
            System.out.println("\n");
        }
    }
}