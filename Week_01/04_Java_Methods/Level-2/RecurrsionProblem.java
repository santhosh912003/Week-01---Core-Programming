import java.util.*;

public class RecurrsionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int recurrsion = recurr(n);
        int formul = formula(n);
        
        
        if(recurrsion==formul){
            System.out.printf("The sum of the %d natural number computed by recurrsion and formalae are same: %d and %d",n,recurrsion,formul);
            return;
        }
        
        else{
            System.out.println("An mismatch between the sum is found. An error occured");
            return;
        }
    }

   static int recurr(int n){
       if(n<=0){
           return 0;
       }
       
       return n+recurr(n-1);
   }
   
   static int formula(int n){
       return n*(n+1)/2;
   }

    
}