import java.util.*;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        sc.close(); 
        String val = Toggle(s);
        System.out.println("The toggled string is: " + val);
    }
    static String Toggle(String s){
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch <= 'z'){
                st.setCharAt(i,Character.toUpperCase(ch));
            }
            else{
                st.setCharAt(i,Character.toLowerCase(ch));
            }
        }
        return st.toString();
      
    }
}
