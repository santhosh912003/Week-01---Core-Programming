import java.util.Scanner;

public class Abundant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        
        if(sum>num){
            System.out.printf("The given number %d is an Abundant number",num);
        }
        else{
            System.out.printf("The given number %d is not an Abundant number",num);
        }
        
        sc.close();
    }
}
