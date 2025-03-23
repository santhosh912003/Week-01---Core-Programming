import java.util.*;

public class Compare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        System.out.println("Checking the values of the array of length 5 ");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+"th value of the arr: ");
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println( arr[i] + " Zero");
            }
            else if(arr[i]>0){
                if(arr[i]%2==0){
                    System.out.println( arr[i] + " is Even Positive");
                }
                else{
                    System.out.println(arr[i] + " is Odd Positive");
                }
            }
            else{
                System.out.println(arr[i] + " Negative");
            }
        }
        
        int last = arr[arr.length-1];
        int first = arr[0];
        
        if(first==last){
            System.out.printf("The first val %d and the last val %d of the arr are equal",first,last);
        }
        else if(first < last){
            System.out.printf("The first val %d is less than the last val %d of the arr",first,last);
        }
        else{
            System.out.printf("The first val %d is greater than the last val %d of the arr",first,last);
        }
        
        sc.close();
        
        
    }
}