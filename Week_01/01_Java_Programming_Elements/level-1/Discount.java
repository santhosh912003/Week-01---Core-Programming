import java.util.*;


public class Discount {
   public static void main(String[] args) {
       int fee = 125000;
       double discount = 10;
	   double DiscountPrice = (fee * (discount / 100));
       double discount_price = fee - DiscountPrice ;


       System.out.println("The discount amount is INR " + DiscountPrice + " and final discounted fee is INR " + discount_price);
   }
}
