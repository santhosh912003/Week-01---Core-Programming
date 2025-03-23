import java.util.*;

public class PalindromeCheck {
    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    
    public static void main(String[] args) {
		System.out.println("Enter the string for palindome check: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
    }
}