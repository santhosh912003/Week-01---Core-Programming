import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("The swapped numbers are %d and %d%n", number1, number2);

        sc.close();
    }
}
