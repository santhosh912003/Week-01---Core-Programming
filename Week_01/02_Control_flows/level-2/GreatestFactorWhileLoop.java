import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int maxi = 1;
            int i = number - 1;

            while (i >= 1) {
                if (number % i == 0) {
                    maxi = i;
                    break;
                }
                i--;
            }

            System.out.println("Greatest factor of " + number + " besides itself is: " + maxi);
        }

        sc.close();
    }
}
