import java.util.*;

public class StringMethodII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string1  of length>2: "); 
        String s1 = sc.nextLine();
        
        System.out.println("Enter the substrinig start index: ");
        
        int s = sc.nextInt();
        
        System.out.println("Enter the substring end index: ");
        int e = sc.nextInt();
        
        
       
        String s2 = substring(s1,s,e);
        System.out.println("Substring by builtin: "+ s2);
        
        
        String s3  = builtInString(s1,s,e);
        System.out.println("Substring by charAT: "+ s3);
        boolean isEqual = userDefined(s1,s2);
    
        System.out.println("Both the Substrings are equal using charAT: "+ isEqual);
        
        
    }
    
    static String substring(String s1, int s, int e){
        String s2 = "";
        for(int i=s;i<=e;i++){
            s2+=s1.charAt(i);
        }
        return s2;
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
    
    static String builtInString(String s1, int s, int e){
        String s2 = s1.substring(s,e+1);
        return s2;
    }
}