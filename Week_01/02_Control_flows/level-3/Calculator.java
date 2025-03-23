import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double first = sc.nextDouble();
        
        System.out.println("Enter second number: ");
        double second = sc.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /): ");
        String op = sc.next(); 
        
        double result = 0;
        boolean valid = true;

        switch (op) {
            case "+": result = first + second; break;
            case "-": result = first - second; break;
            case "*": result = first * second; break;
            case "/": 
                if (second != 0) result = first / second;
                else {
                    System.out.println("Error: Division by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }

        if (valid) {
            System.out.printf("Result: %.2f %s %.2f = %.2f", first, op, second, result);
        }

        sc.close();
    }
}
