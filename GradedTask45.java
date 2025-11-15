import java.util.Scanner;

public class GradedTask45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("Output: 3");  
        } else if (a == b || a == c || b == c) {
            System.out.println("Output: 2");  
        } else {
            System.out.println("Output: 0");  
        }
    }
}
