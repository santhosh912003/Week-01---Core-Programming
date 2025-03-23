import java.util.*;

public class StringMethodIV{
    public static void main(String[] args){
        
        HandleException();
        
    }
    
    static void generateException(){
        String t = null;
        
        System.out.println(t.length());
    }
    
    
    static void HandleException(){
        String t = null;
        try{
            System.out.println("The lenght of the string is: "+String.valueOf(t.length()));
            System.out.println();
        }
        catch(Exception e){
            System.out.println("A exception occured; Null Pointer Exception occured");
        }
    }
}