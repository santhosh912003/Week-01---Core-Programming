import java.util.*;



public class StringMethodVI {
    public static void main(String[] args){
        // generateException();
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the stirng value: ");
        String s = sc.nextLine();
        handleException(s);
        // generateException(s);
        
        
        
        
    }
    static void generateException(String s){
        int st = 5;
        int e = 0;
        
        if(st>e){
            throw new IllegalArgumentException("There is an illigal argument passed in this method to geneate this illegalArgument Exception");
        }
        
        // System.out.println(s.substring(s,e));
        return;
    }
    
    
    static void handleException(String s){
        int st = 5;
        int e = 0;
        
        try{
           if(st>e){
            throw new IllegalArgumentException("There is an illigal argument passed in this method to geneate this illegalArgument Exception");
           }
        }
        catch (IllegalArgumentException eff){
            System.out.println("The exception is : "+ eff.getMessage());
        }
         catch (RuntimeException f) {
            System.out.println("Generic RuntimeException caught: " + 
            f.getMessage());
        }
        
    }
    

}