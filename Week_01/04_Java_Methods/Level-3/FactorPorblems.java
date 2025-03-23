import java.util.*;


public class FactorPorblems {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    sc.close();

    int[] factors = NumberChecker.Factors(number);

    System.out.println("Factors: " + Arrays.toString(factors));
    System.out.println("Greatest Factor: " + NumberChecker.Greatest(factors));
    System.out.println("Sum of Factors: " + NumberChecker.sum(factors));
    System.out.println("Product of Factors: " + NumberChecker.product(factors));
    System.out.println("Product of Cubes of Factors: " + NumberChecker.productOfCubes(factors));
    System.out.println("Is Perfect Number? " + NumberChecker.Perfect(number));
    System.out.println("Is Abundant Number? " + NumberChecker.Abundant(number));
    System.out.println("Is Deficient Number? " + NumberChecker.Deficient(number));
    System.out.println("Is Strong Number? " + NumberChecker.Strong(number));
}
}

class NumberChecker {

    public static int[] Factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int Greatest(int[] factors) {
        return Arrays.stream(factors).max().orElse(1);
    }

    public static int sum(int[] factors) {
        return Arrays.stream(factors).sum();
    }

    public static int product(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int productOfCubes(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean Perfect(int num) {
        int sum = sum(Factors(num)) - num;
        return sum == num;
    }

    public static boolean Abundant(int num) {
        int sum = sum(Factors(num)) - num;
        return sum > num;
    }

    public static boolean Deficient(int num) {
        int sum = sum(Factors(num)) - num;
        return sum < num;
    }

    public static boolean Strong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }
}

