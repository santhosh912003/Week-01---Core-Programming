import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        
        int num = sc.nextInt();
        
        if(num<1){
            System.out.println("Number is invalid. prime check is for numbers > than 1");
        }
        else{
            boolean isPrime = true;
         
            for(int i=2;i<num;i++){
                if(num%i==0) {
                    isPrime = false;
                    break;
                }
                
            }
            
            if(isPrime){
                System.out.printf("The given number %d is a prime.",num);
            }
            else{
                System.out.printf("The given number %d is a not a prime.",num);
            }
        }
        

        sc.close();
    }
}
