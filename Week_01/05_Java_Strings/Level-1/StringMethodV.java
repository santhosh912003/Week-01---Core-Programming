import java.util.*;

public class StringMethodV{
    public static void main(String[] args){
        // generateException();
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the stirng value: ");
        String s = sc.nextLine();
        handleException(s);
        generateException(s);
        
        
        
        
    }
    static void generateException(String s){
        
        int index = 100000;
        
        System.out.println("the value at index 10000 is: "+ s.charAt(index));
    }
    
    
    static void handleException(String s){
        
        int index = 100000;
        try{
            System.out.println("the value at index 10000 is: "+ s.charAt(index));
        }
        catch (Exception e){
            System.out.println("An exception occured, StringIndexOutOfBoundsException: Index out of bound occured");
        }
        
    }
    

}