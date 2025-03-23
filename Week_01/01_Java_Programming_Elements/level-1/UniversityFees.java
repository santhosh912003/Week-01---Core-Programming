


import java.util.*;




public class UniversityFees {
   public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the university fees: ");
       int fee = sc.nextInt();
       System.out.println("Enter the discount percent: ");
       double percent = sc.nextDouble();

		double discount = (fee * (percent / 100));
       double discount_price = fee - discount;


       System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discount_price);
   }


}
