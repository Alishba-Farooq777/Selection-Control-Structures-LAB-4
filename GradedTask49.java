import java.util.Scanner;
public class GradedTask49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = scanner.nextInt();

        int totalCents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);

        System.out.println(); 
        if (totalCents == 100) {
            System.out.println("Congratulations! You win the game!");
        } else if (totalCents < 100) {
            System.out.println("The total amount is less than one dollar.");
        } else {
            System.out.println("The total amount is more than one dollar.");
        }

        scanner.close();
    }
}
