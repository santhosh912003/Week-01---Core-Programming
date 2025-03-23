import java.util.*;

class MaximumHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Students: ");
        int p = sc.nextInt();
        
        
        int hs = (p *(p-1))/2;
        
        System.out.printf("The maximum number of handshakes among %d number of students is %d.",p,hs);
    }
}