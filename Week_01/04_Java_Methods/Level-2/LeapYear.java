import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year you wanna check (>=1582 based on georgian calender): ");
        int y = sc.nextInt();
        
        
        if(y<1582){
            System.out.println("Invalid Year");
            return;
        }
        
        
        boolean isLeap = helper(y);
        
        if(isLeap){
            System.out.println("The given year is leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
        
    }
    
    static boolean helper(int y ){
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    
}