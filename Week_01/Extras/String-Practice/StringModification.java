import java.util.*;

public class StringModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the character you wanna remove: ");
        char ch = sc.next().charAt(0);
        String res= removed(s1,ch);
        System.out.printf("Modified String:  %s", res);
        sc.close(); 
        
       
    }
    static String removed(String s,char ch){
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch) continue;
            
            res+=s.charAt(i);
        }
        
        return res;
        
        
    }
    
}
