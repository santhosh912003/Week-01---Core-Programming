import java.util.*;

public class StringMethodIII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string1  of length>2: "); 
        String s1 = sc.nextLine();
        
        
        
        System.out.println("Thechar array using user defined method is : "+ Arrays.toString(string_arr(s1)));
        
        System.out.println("The char array using buinlt in is: "+Arrays.toString(builtInString(s1)));
        
        
        System.out.println("The both char ARRAY are: "+ userDefined(builtInString(s1),string_arr(s1)));
        
        
       
       
        
    }
    
    static char[] string_arr(String s1){
        char[] arr = new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            arr[i] = s1.charAt(i);
        }
        
        return arr;
    }
    
    
    static boolean userDefined(char[] s1, char[] s2){
        
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
            
        }
        
        return true;
    }
    
    static char[] builtInString(String s1){
        char[] arr = s1.toCharArray();
        return arr;
    }
}