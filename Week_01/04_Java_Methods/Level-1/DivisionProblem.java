import java.util.Scanner;

public class DivisionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend (num1): ");
        int num1 = sc.nextInt();
        
       System.out.println("Enter the divisor (num2): ");
       int num2 = sc.nextInt();

       if(num2==0){
           System.out.println("Zero Division Error");
           return;
       }
       
       int[] arr = findRemainderAndQuotient(num1,num2);
       
       System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d",arr[1],arr[0],num1,num2);
    }
	
	static int[] findRemainderAndQuotient(int num1, int num2){ 

	    int r = num1 % num2;
        int q = (int) (num1 / num2);
		return new int[] {r,q};
		

	}
}