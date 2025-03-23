import java.util.*;


public class KmMiles {
   public static void main(String[] args) {


       Scanner input = new Scanner(System.in);


       double km;


       System.out.print("Enter distance in kilometers: ");
       km = input.nextInt();
       double miles = km / 1.6;


       System.out.printf("The total miles is %.2f miles for the given %.2f km%n", miles, km);


       input.close();
   }
}
