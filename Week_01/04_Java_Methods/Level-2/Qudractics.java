import java.util.*;

public class Qudractics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        int d = delta(a, b, c);
        int[] ans;

        if (d > 0) {
            ans = twoRoots(a, b, d);
        } else if (d == 0) {
            ans = oneRoot(a, b);
        } else {
            ans = new int[] {};  
        }

  
        if (ans.length == 2) {
            System.out.println("Roots are: " + ans[0] + " and " + ans[1]);
        } else if (ans.length == 1) {
            System.out.println("Root is: " + ans[0]);
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }

    static int delta(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    static int[] twoRoots(int a, int b, int d) {
        int sqrtD = (int) Math.sqrt(d);
        int root1 = (-b + sqrtD) / (2 * a);
        int root2 = (-b - sqrtD) / (2 * a);
        return new int[] { root1, root2 };
    }

    static int[] oneRoot(int a, int b) {
        int root = -b / (2 * a);
        return new int[] { root };
    }
}
