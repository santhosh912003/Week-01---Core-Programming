import java.util.*;

public class LexographicalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2: ");
        String s2 = sc.nextLine();
        sc.close(); 
        int val = lexoGraphic(s1,s2);
        
        if(val==0){
            System.out.println("Both the strings are same");
        }
        else if(val < 1){
             System.out.printf("%s comes before %s in lexicographical order",s1,s2);
        }
        else{
            System.out.printf("%s comes before %s in lexicographical order",s2,s1);
        }
       
    }
    static int lexoGraphic(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int min_len = Math.min(len1,len2);
        
        for(int i=0;i<min_len;i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(ch1 != ch2) {
                return (int) ch1-ch2;
            }
            
        }
        return len1-len2;
    }
    
}
