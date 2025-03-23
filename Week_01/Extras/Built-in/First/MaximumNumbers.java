import java.util.*;

public class MaximumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three number in next next lines");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("The maximun in the given 3 numbers are: ");
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
