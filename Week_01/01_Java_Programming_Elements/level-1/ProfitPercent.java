import java.util.*;
public class ProfitPercent {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;


        int profit = sp - cp;
        double profit_percent = ((double) profit / cp) * 100; // Corrected division


        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profit_percent + "%");
    }
}
