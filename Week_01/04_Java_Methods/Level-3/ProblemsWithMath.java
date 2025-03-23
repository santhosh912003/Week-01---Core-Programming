import java.util.*;

public class ProblemsWithMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Number: " + number);
        int[] digits = Digits(number);
        int[] s_digits = Digits(number*number);
        System.out.println("Is Prime Number: " + Prime(number));
        System.out.println("Is Neon Number: " + Neon(number,s_digits));
        System.out.println("Is SPY Number: " + Spy(digits));
        System.out.println("Is Buzz Number: " + Buzz(number));
        System.out.println("Is Automorphic Number: " + Automorphic(number));
    }


    static int[] Digits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    static boolean Prime (int num) {
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
        
    }

    static boolean Neon(int num, int[] digits) {
        int sum = 0;
        for(int n: digits){
            sum+=n;
        }
        
        return sum==num;
    }

    static boolean Spy(int[] digits) {
        int pod = 1;
        int sum = 0;
        for(int n:digits){
            pod *= n;
            sum += n;
        }
        return pod==sum;
    }
    
    static boolean Automorphic(int num){
        String s = String.valueOf(num);
        int sq = num*num;
        String sq_s = String.valueOf(sq);
        return sq_s.endsWith(s);
        
        
    }

    
    static boolean Buzz(int n){
        return  (n%7==0 || n%10==7);
    }
}


