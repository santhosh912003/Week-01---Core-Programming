import java.util.*;

class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the num 1: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the num 2: ");
        int b = sc.nextInt();
        
        int add = a+b;
        int sub = a-b;
        int mul = a * b;
        double div = a/b;
        
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, %.2f%n", a,b,add,sub,mul,div);
        sc.close();
        
    }
}