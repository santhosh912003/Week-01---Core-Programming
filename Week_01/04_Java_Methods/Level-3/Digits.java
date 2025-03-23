import java.util.*;

public class Digits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = Digits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + DuckNumber(digits));
        System.out.println("Is Armstrong Number: " + Armstrong(number, digits));
        int[] largestTwo = LargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);
        int[] smallestTwo = SmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] Digits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    static boolean DuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean Armstrong(int number, int[] digits) {
        int sum = 0, pow = digits.length;
        for (int num : digits) {
            sum += Math.pow(num, pow);
        }
        return sum == number;
    }

    static int[] LargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[]{largest, secondLargest};
    }

    static int[] SmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
