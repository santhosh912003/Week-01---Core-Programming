import java.util.*;

public class StringModificationII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the word you wanna remove: ");
        String word = sc.nextLine();
        String res= removed(s1,word);
        System.out.printf("Modified String:  %s", res);
        sc.close(); 
        
       
    }
    static String removed(String s,String word){
        String[] words  = s.split(" ");
        String res = "";
        for(String w :words){
            if(w.equals(word)) continue;
            
            res+=w;
            res+=" ";
        }
        
        return res;
        
        
    }
    
}
