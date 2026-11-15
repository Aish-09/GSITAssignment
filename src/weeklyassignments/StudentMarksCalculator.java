package weeklyassignments;

import java.util.*;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        try {
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                total += marks[i];
            }

            double average = (double) total / marks.length;
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            // Uncomment the line below to test ArrayIndexOutOfBoundsException:
            //System.out.println(marks[5]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer values only for marks.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index!");
        } finally {
            scanner.close();
            System.out.println("Marks calculation process completed");
        }
    }
}