import java.util.*;

public class DigitsProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = Digits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sum(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + Harshad(number, digits));
        int[] freq = Frequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i=0;i<freq.length;i++) {
            if(freq[i]!=0){
              System.out.println("Digit: " + i + " - Frequency: " + freq[i]);  
            }
            
        }
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

    static int sum(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    static boolean Harshad(int num, int[] digits) {
        return num % sum(digits) == 0;
    }

    static int[] Frequency(int[] digits) {
        int max = Integer.MIN_VALUE;
        for(int num: digits){
            max = Math.max(max,num);
        }
        
        int[] freq = new int[max+1];
        
        for(int num : digits){
            freq[num]++;
        }
        
        return freq;
    }
}
