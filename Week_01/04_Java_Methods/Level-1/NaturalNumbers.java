import java.util.*;

public class NaturalNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int m = sc.nextInt();
        
        if(m<=0){
            System.out.println("The number is not an natural number");
            return;
        }
        
        int ans  = helper(m);
        System.out.printf("The sum of n natural numbers using loop is %d",ans);
        
    }
    
    static int helper(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
                    sum+=i;
                }
                
        return sum;
    }
}