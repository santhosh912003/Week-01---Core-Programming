import java.util.*;


class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the seconf number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        
        String first = helper(a,b,c);
        String second = helper(b,a,c);
        String third = helper(c,a,b);
        
        System.out.println("Is the first number the largest? "+first);
        System.out.println("Is the second number the largest? "+second);
        System.out.println("Is the third number the largest? "+third);

    }
    
    static String helper(int a, int b, int c){
        if(a>b && a>c){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}