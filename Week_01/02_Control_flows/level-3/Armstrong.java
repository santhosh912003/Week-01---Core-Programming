import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        
        String num = sc.nextLine();
        
        if(num.isEmpty()){
            System.out.println("Number is invalid. please enter an valid number. ");
        }
        else{
            int pow = num.length();
            
            int n = Integer.parseInt(num);
            int copy = n;
            int sum = 0;
            
            while(copy!=0){
                int val = copy %10;
                
                sum+= Math.pow(val,pow);
                
                copy = copy / 10;
                
            }
            
            if(sum==n){
                System.out.printf("The given number %d is an Armstrong number",n);
            }
            else{
                System.out.printf("The given number %d is not an Armstrong number",n);
            }
        }
        

        sc.close();
    }
}
