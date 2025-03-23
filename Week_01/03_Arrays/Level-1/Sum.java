import java.util.*;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 10;
        double[] arr = new double[size];
        double sum = 0;
        int index = 0;
        while(true){
            
            if(index>=size){
                break;
            }
            System.out.printf("Enter the value of the array for the index %d%n",index);
            double val = sc.nextDouble();
            if(val<=0){
                break;
            }
            else{
                arr[index] = val;
                sum+=val;
            }
            index++;
        }
        
        System.out.print("The total sum of the value in arr untill the user entered <= 0 is: ");
        System.out.println(sum);
        

        
        sc.close();
        
        
    }
}