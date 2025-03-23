import java.util.*;

public class StringWordsList{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string value: ");
    String s = sc.nextLine();
    
    String[] ans = words(s);
    
    System.out.println("The words list using custom method is: "+Arrays.toString(words(s)));
    System.out.println("The words list using inbuilt method is: "+ Arrays.toString(s.split(" ")));
        
        
    System.out.println("Both words array are equal ?: "+ Same(s));
    }
    
    static boolean Same(String s){
        String[] w = words(s);
        String[] w2 = s.split(" ");
        
        if(w.length != w2.length) return false;
        for(int i=0;i<w.length;i++){
            System.out.println(w[i] + " "+ w2[i]);
            if(!w[i].equals(w2[i])){
                return false;
            }
        }
        
        return true;
        
    }
    
   static String[] words(String s){
      String[] ans = new String[spaces(s)+1];
      int index= 0;
      String temp = "";
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==' '){
              System.out.println(temp);
              ans[index++] = temp;
              temp = "";
          }
          else{
              temp+=s.charAt(i);
          }
          
      }
      if(index<ans.length){
           ans[index] = temp;
      }
     
      
      return ans;
   }
   
   static int spaces(String s){
       int c = 0;
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               c++;
           }
       }
       return c;
       
   }
    
    
    
    
}