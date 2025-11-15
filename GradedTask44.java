import java.util.Scanner;

public class GradedTask44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Part (a) - Minimum of two numbers:");
        System.out.print("Enter first number: ");
        int a1 = input.nextInt();
        System.out.print("Enter second number: ");
        int a2 = input.nextInt();

        if (a1 < a2) {
            System.out.println("Smaller value is: " + a1);
        } else {
            System.out.println("Smaller value is: " + a2);
        }

        System.out.println("\nPart (b) - Minimum of two numbers:");
        System.out.print("Enter first number: ");
        int b1 = input.nextInt();
        System.out.print("Enter second number: ");
        int b2 = input.nextInt();

        if (b1 < b2) {
            System.out.println("Smaller value is: " + b1);
        } else {
            System.out.println("Smaller value is: " + b2);
        }

        System.out.println("\nPart (c) - Sign function:");
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        if (x > 0) {
            System.out.println("Sign is: 1");
        } else if (x < 0) {
            System.out.println("Sign is: -1");
        } else {
            System.out.println("Sign is: 0");
        }

        // Part (d) - Minimum of three numbers
        System.out.println("\nPart (d) - Minimum of three numbers:");
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();

        int smallest;

        if (n1 < n2 && n1 < n3) {
            smallest = n1;
        } else if (n2 < n1 && n2 < n3) {
            smallest = n2;
        } else {
            smallest = n3;
        }

        System.out.println("Smallest value is: " + smallest);
    }
}
