import java.util.Scanner;

public class GradedTask410 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number of books purchased
        System.out.print("Enter the number of books purchased this month: ");
        int books = input.nextInt();

        int points;

        // Determine the number of points based on books purchased
        if (books == 0) {
            points = 0;
        } else if (books == 1) {
            points = 5;
        } else if (books == 2) {
            points = 15;
        } else if (books == 3) {
            points = 30;
        } else if (books >= 4) {
            points = 60;
        } else {
            // Handle negative input
            System.out.println("Invalid input. Number of books cannot be negative.");
            return;
        }

        // Display the points earned
        System.out.println("You earned " + points + " points.");
    }
}
