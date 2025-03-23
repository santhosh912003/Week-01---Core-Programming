import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            long factorial = 1;
            int i = n;

            while (i > 1) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        sc.close();
    }
}
