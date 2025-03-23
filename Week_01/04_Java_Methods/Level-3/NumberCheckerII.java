import java.util.*;

public class NumberCheckerII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = Digits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] reversedDigits = reverse(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Is Palindrome: " + Palindrome(digits));
        System.out.println("Is Duck Number: " + DuckNumber(digits));
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] Digits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    static int[] reverse(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    static boolean compare(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    static boolean Palindrome(int[] digits) {
        return compare(digits, reverse(digits));
    }

    static boolean DuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
