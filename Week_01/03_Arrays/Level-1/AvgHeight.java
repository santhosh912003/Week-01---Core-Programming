import java.util.*;

public class AvgHeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 11;
        double[] arr = new double[size];
        double sum =0;
        System.out.println("Enter the Height of the players of the football team");
        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter the Height of the player "+(i+1)+" in cm:");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        
        double avg = sum / arr.length;
        System.out.printf("The mean height of the football team is %.3f cm",avg);
        

        
        sc.close();
        
        
    }
}