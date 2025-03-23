import java.util.*;

public class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 4;
        int[] arr = new int[size];
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.printf("Multiplication table for the number %d from 6 to 9:%n",num);
        
        for(int i=6;i<10;i++){
            arr[i-6] = num * i;
            System.out.printf("%d x %d = %d%n", num,i,arr[i-6]);
        }
        

        
        sc.close();
        
        
    }
}