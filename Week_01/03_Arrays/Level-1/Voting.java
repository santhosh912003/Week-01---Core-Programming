import java.util.*;

public class Voting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        System.out.println("Checking the age of 10 students for Voting Criteria");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the age of the "+(i+1)+"th Student: ");
            int val = sc.nextInt();
            if(val<=0){
                System.out.println("Invalid AGE. Age sould be positive. Please re run the program");
                return;
            }
            
            else{
                arr[i] = val;
            }
        }
        
        for(int num:arr){
            if(num >=18){
                System.out.printf("The student with the age %d can vote%n",num);
            }
            else{
                System.out.printf("The student with the age %d cannot vote%n",num);
            }
        }
    }
}