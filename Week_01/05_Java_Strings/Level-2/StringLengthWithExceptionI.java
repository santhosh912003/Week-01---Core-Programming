import java.util.*;

public class StringLengthWithExceptionI {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string value: ");
    String s = sc.nextLine();
    
    System.out.println("The length of the string using builtin method is: "+ s.length());
    
    
    System.out.print("The length of the string using custom method is: ");
    
    handleException(s);
        
    }
    
    static void handleException(String s){
        int c = 0;
        int index= 0;
        while(true){
            try{
                char ch = s.charAt(index);
                c++;
                index++;
            }
            catch(Exception e){
                System.out.println(c);
                System.out.println("A runtime Exception is occured");
                break;
            }
            
        }
    }
    
    
    
}