
import java.util.*;

public class StringMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string1 : ");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the string2: ");
        String s2 = sc.nextLine();
        
        
        boolean isEqual = userDefined(s1,s2);
        boolean isEqual2 = builtIn(s1,s2);
        
        System.out.println("Both the strings are equal using charAT: "+ isEqual);
        
        System.out.println("Both the strings are equal using built in method: "+ isEqual2);
    }
    
    
    static boolean userDefined(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
            
        }
        
        return true;
    }
    
    static boolean builtIn(String s1, String s2){
        return s1.equals(s2);
    }
}