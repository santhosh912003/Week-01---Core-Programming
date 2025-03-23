import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close(); 
        String val = reverse(s);
        boolean flag = palindrome(val,s);
        System.out.println("The given string is a Palindrome ? : "+flag );
    }

    static String reverse(String s) {
        String temp = "";
        for(int i=s.length()-1;i>=0;i--){
            temp += s.charAt(i);
        }
        return temp;
    }
    
    static boolean palindrome(String s1 , String s2){
        return s1.equals(s2);
    }
}
