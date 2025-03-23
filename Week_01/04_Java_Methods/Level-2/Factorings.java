import java.util.*;

public class Factorings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        
        int[] factors = Factors(n);
        int[] values = summOfFactors(factors);
        
        System.out.println("The factors of the give number is: "+ Arrays.toString(factors));
        System.out.println("The sum of the factors are: " +values[0]);
        System.out.println("The sum of the  squares of the factors are: " +values[1]);
        System.out.println("The product of the factors are: " +values[2]);
        

        sc.close();
    }

    public static int[] Factors(int n) {
        int c = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        
        int[] arr = new int[c];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[index++]=i;
                
            }
        }
        
        return arr;
    }
    
    static int[] summOfFactors(int[] arr){
        int sum = 0;
        int squareSum = 0;
        int prod = 1;
        for(int num:arr){
            sum+=num;
            squareSum += Math.pow(num,2);
            prod *= num;
        }
        
        return new int[] {sum,squareSum,prod};
    }

    
}