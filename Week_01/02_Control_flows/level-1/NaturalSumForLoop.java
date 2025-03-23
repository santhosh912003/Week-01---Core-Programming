import java.util.Scanner;

public class NaturalSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.printf("This number %d is not a Natural Number%n", n);
        } else {
            int f_sum = (n * (n + 1)) / 2;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum calculated using for loop: " + sum);
            System.out.println("Sum calculated using formula: " + f_sum);

            if (sum == f_sum) {
                System.out.println("Both computations match! The result is correct.");
            } else {
                System.out.println("Mismatch found! There might be an error in calculations.");
            }
        }

        sc.close();
    }
}
