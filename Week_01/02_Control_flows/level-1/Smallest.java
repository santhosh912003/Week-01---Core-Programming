import java.util.*;
class Smallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the seconf number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        
        if(a <b && a < c){
            System.out.println("Is the first number the smallest? Yes");
        }
        else{
             System.out.println("Is the first number the smallest? No");
        }
    }
}