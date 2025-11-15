public class GradedTask41 {
    public static void main(String[] args) {
        int x = 10, y = 15, z = 20;

        System.out.print("1. !(x > 10): ");
        System.out.println(!(x > 10));

        System.out.print("2. x <= 5 || y < 15: ");
        System.out.println(x <= 5 || y < 15);

        System.out.print("3. (x != 5) && (y != z): ");
        System.out.println((x != 5) && (y != z));

        System.out.print("4. x >= z || (x + y >= z): ");
        System.out.println(x >= z || (x + y >= z));

        System.out.print("5. (x <= y - 2) && (y >= z) || (z - 2 != 20): ");
        System.out.println((x <= y - 2) && (y >= z) || (z - 2 != 20));
    }
}
