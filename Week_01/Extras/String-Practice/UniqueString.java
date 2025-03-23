import java.util.*;

public class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close(); 
        String val = Unique(s);
        System.out.println("The modified string wiht Unique characters: " + val);
    }
    static String Unique(String s){
        Set<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++){
            st.add(s.charAt(i));
        }
        
        String s_new  = "";
        for(char ch:st){
            s_new += ch;
        }
        
        return s_new;
    }
}
