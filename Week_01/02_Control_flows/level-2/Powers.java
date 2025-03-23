import java.util.Scanner;

public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();
        
        int res = 1;
        
        if (pow <= 0 || num <= 0) {
            System.out.println("Only positive numbers are allowed. Please reenter the values.");
        } else {
            for (int i = 1; i <= pow; i++) {
                res *= num;
            }
            System.out.println(num + " raised to the power " + pow + " is: " + res);
        }

        sc.close();
    }
}
