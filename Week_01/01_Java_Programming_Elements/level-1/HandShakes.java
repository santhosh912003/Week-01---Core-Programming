import java.util.Scanner;

public class HandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int n = sc.nextInt();
        
        int total_handshakes = (int) (n *(n-1))/2;
        System.out.printf("The maximum number of handshakes among %d number of students is %d", n,total_handshakes);
        
        sc.close();
    }
}