
import java.util.*;


class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose digit you wanna reverse: ");
        int num = sc.nextInt();
        
        int len = String.valueOf(num).length();
        
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = num%10;
            num=num/10;
        }
        
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}