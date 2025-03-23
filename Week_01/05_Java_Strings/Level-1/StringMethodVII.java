import java.util.*;



public class StringMethodVII{
    public static void main(String[] args){
        // generateException();
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the stirng value: ");
        String s = sc.nextLine();
        handleException(s);
        generateException(s);
        
        
        
        
    }
    static void generateException(String s){
        System.out.println("The converted value  is: " + Integer.parseInt(s));
    }
    
    
    static void handleException(String s){
        
        
        try{
           System.out.println("The converted value  is: " + Integer.parseInt(s));
        }
        catch (NumberFormatException eff){
            System.out.println("The Number format exception is  for  : "+ eff.getMessage());
        }
         catch (RuntimeException f) {
            System.out.println("Generic RuntimeException caught: " + 
            f.getMessage());
        }
        
    }
    

}