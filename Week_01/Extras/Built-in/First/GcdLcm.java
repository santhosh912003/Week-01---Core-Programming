import java.util.*;


public class GcdLcm {
    static int gcd(int a, int b) {
        while(b!=0){
          int temp = b;
		  b = a%b;
		  a = temp;
        }
		
		return a;
    }
    
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
		System.out.println("Enter the two number for gcd and lcm calculation : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}