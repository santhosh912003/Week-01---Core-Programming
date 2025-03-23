import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        double res = 0;
        
        switch (op) {
            case '+': 
                res = a + b;
                break;
            case '-': 
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Zero division error");
                    sc.close();
                    return;
                }
                res = a / b;
                break;
            default: 
                System.out.println("Invalid operator");
                sc.close();
                return;
        }
        
        System.out.println("Result: " + res);
        sc.close();
    }
}
