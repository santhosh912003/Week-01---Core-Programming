
import java.util.*;


class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n  = sc.nextInt();
        
        int[] freq = new int[10];
        
        while(n!=0){
            int val = n%10;
            freq[val]++;
            n = n /10;
        }
        
        for(int i=0;i<10;i++){
            if(freq[i]!=0){
                System.out.printf("The frequency of the digit %d in the given number is %d",i,freq[i]);
                System.out.println();
            }
        }
        
        sc.close();
    }
}