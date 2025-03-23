import java.util.*;

public class Multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            arr[i] = (i+1) * num;
            
            
        }
        System.out.printf("Multiplication table for the number %d%n",num);
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d x %d = %d%n",num,(i+1),arr[i]);
        }
        
        

        
        sc.close();
        
        
    }
}