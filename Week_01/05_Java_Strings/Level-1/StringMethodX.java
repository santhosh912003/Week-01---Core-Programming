import java.util.*;

public class StringMethodX {

    static String toUp(String s){
        StringBuilder st = new StringBuilder();
        for(char val : s.toCharArray()){
            if(val >= 'A' && val <= 'Z'){
                st.append((char) (val + 32));
            }
            else{
                st.append(val);
            }
        }
        
        return st.toString();
    }
    public static boolean compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String value: ");
        String s = sc.nextLine();
        
        String upper  = s.toLowerCase();
        String upper_manual = toUp(s);
        boolean isequal = compare(upper, upper_manual);
        
        System.out.println("\nOriginal Text: " + s);
        System.out.println("Built-in toLowerCase(): " + upper);
        System.out.println("Manual Conversion: " + upper_manual);
        System.out.println("Are both methods producing the same result? " + isequal);
        

    }
}
