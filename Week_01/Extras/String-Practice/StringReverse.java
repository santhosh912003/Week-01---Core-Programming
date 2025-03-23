import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close(); 
        String val = reverse(s);
        System.out.println("The given string is reversed as: "+val );
    }

    static String reverse(String s) {
        String temp = "";
        for(int i=s.length()-1;i>=0;i--){
            temp += s.charAt(i);
        }
        return temp;
    }
}
