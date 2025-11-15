import java.util.Scanner;

public class GradedTask48{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (in numeric form 1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter two-digit year (e.g., 60 for 1960): ");
        int year = scanner.nextInt();

        if (month * day == year) {
            System.out.println("The date is magic!");
        } else {
            System.out.println("The date is not magic.");
        }

        scanner.close();
    }
}
