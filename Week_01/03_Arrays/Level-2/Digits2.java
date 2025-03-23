
import java.util.*;


class Digits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        int index = 0;
        
        System.out.println("Enter the number: ");
        long val = sc.nextLong();
        
        if(val<10){
            System.out.println("This number is no suitable for this program. enter atlest an 2 digit number");
            return;
        }
        
        
        while(val>0){
            int num = (int) (val % 10);
            if(index==size){
                int[] temp = new int[size+10];
                size+=10;
                System.arraycopy(arr,0,temp,0,arr.length);
                arr = temp;
            }
            arr[index++] = num;
            
            val = val/10;
        }
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int v : arr){
            
            if(v>first){
                second = first;
                first = v;
            }
            
            else if(v>second && first!=v){
                second = v;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number as all digits are the same.");
        } else {
            System.out.printf("The Largest and the second Largest numbers in the given number are: %d and %d%n", first, second);
        }

        
        
        
        sc.close();
    }
}