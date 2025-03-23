import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("The number has 1 digit.");
        } else {
            int count = 0;
            int num = Math.abs(number);
            while (num != 0) {
                num /= 10; 
                count++;
            }
            System.out.println("The number has " + count + " digits.");
        }

        sc.close();
    }
}
