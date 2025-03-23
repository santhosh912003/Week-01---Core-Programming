import java.util.Scanner;

public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int maxi = 1;

            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    maxi = i;
                    break;
                }
            }

            System.out.println("Greatest factor of " + number + " besides itself is: " + maxi);
        }

        sc.close();
    }
}
