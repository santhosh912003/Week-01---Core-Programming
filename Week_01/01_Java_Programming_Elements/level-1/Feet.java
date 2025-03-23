import java.util.*;


public class Feet {
   public static void main(String[] args) {
       
       
    Scanner sc = new Scanner(System.in);
       System.out.print("Enter height in cm: ");
       int height = sc.nextInt();
       
       double total_inches = height / 2.54;  // Convert cm to inches
       int feet = (int) (total_inches / 12);  // Extract feet (integer part)
       double inches = total_inches - (feet * 12);
       
       System.out.println("Your Height in cm is "+ height +" while in feet is "+feet+" and inches is " + inches);
   }


}