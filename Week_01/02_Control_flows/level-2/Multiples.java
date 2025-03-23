import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = number; i < 100; i += number) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

