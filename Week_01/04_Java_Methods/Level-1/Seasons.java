import java.util.*;

public class Seasons{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  month : ");
        int m = sc.nextInt();
        System.out.println("Enter the  day : ");
        int d = sc.nextInt();
        
        boolean isSpring = helper(m,d);
        

        if(isSpring){
            System.out.println("It's a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
        
    }
    
    static boolean helper(int m, int d){
                boolean isSpring = (m == 3 && d >= 20 && d <=31) ||
                (m == 4 && d >= 1 && d <=30) || 
                (m == 5 && d >= 1 && d <=31) || 
                (m == 6 && d >= 1 && d <=20);
                
                return isSpring;
    } 
}