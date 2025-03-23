import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();

        System.out.println("Enter the number of Quantities: ");
        int q = sc.nextInt();

        double total_inr = q * unitPrice;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.3f", total_inr,q,unitPrice);

        sc.close();
    }
}