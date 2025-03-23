import java.util.*;

public class Factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        
        int num = sc.nextInt();
        if(num<=0){
            System.out.printf("The number %d is not a natural number%n", num);
            return;
        }
        
        int maxIndex = 10;
        int[] factor = new int[maxIndex];
        
        int index = 0;
        for(int i=1;i<=num;i++){
            
            
            
            if(num%i==0){
                if(index==maxIndex){
                int[] temp = new int[maxIndex*2];
                System.arraycopy(factor,0,temp,0,factor.length);
                factor = temp;
                }
                factor[index] = i;
                index++;
            }
            
        }
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }
        System.out.println(); 
        sc.close();
        
        
    }
}