import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int copy = num;
        
        while(copy!=0){
            int val = copy%10;
            sum+=val;
            copy = copy /10;
        }
        
        if(num%sum==0){
            System.out.printf("The given number %d is an Harshad number",num);
        }
        else{
            System.out.printf("The given number %d is not an Harshad number",num);
        }
        
        sc.close();
    }
}
