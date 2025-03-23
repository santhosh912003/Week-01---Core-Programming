
import java.util.*;
public class FibonacciNumber {
    static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
    
    public static void main(String[] args) {
		System.out.println("Enter the number of fibbonacci terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}