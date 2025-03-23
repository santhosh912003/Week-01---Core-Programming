import java.util.*;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        
        int num = sc.nextInt();
        if(num<=0){
            System.out.printf("The number %d is not a natural number%n", num);
            return;
        }
        int size = (num/2)+1;
        
        int[] e = new int[size];
        int[] o = new int[size];
        
        int eindex = 0;
        int oindex = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                e[eindex] = i;
                eindex++;
            }
            else{
                o[oindex++] = i;
            }
        }
        
        System.out.println("Even array elements:");
        for(int n:e){
            if(n==0) continue;
            System.out.println(n);
        }
        System.out.println("Odd array elements:");
        for(int n:o){
            if(n==0) continue;
            System.out.println(n);
        }
        

        
        sc.close();
        
        
    }
}