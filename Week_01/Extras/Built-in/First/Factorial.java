import java.util.*;


public class Factorial {
    static int factorial(int n) {
        return (n<=1) ? 1 : n * factorial(n-1);
    }
    
    public static void main(String[] args) {
		System.out.println("Enter the number whose factorial you want: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}